package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import frs.Flight;
import frs.FlightInstance;
import frs.Reservation;
import frs.Passenger;

public class ReadData {
	
	public static Reservation getReservationByCode(String resCode) {
		return Database.resCodeMap.get(resCode);
	}
	
	public static List<Flight> flightsByDepartureDestination(String DepAirportCode, String DestAirportCode, LocalDate date) {
		List<Flight> flights = new ArrayList<Flight>();
		for (Flight f : Database.flights) 
		{ 
		    if(f.getDepartureAirport().getCode() == DepAirportCode && f.getArrivalAirport().getCode() == DestAirportCode ) {
		    	for(FlightInstance fi:f.getFlightInstances()) {
		    		if(fi.getDate().compareTo(date) == 0) {
		    			flights.add(f);
		    		}
		    	}
		    }
		}
		return flights;
	}
	
	public static List<Reservation> getReservationByPassenger(int id){
		List<Reservation> reservations = new ArrayList<Reservation>();
		for (Passenger p : Database.passengers) 
		{ 
			if(p.getId() == id) {
				reservations.addAll(p.getReservations());
			}
		}
		return reservations;
	}
	
}
