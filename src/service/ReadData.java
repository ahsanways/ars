package service;

import java.util.List;

import database.Database;
import frs.Airport;
import frs.FlightInstance;
import frs.Reservation;
import frs.Ticket;

public class ReadData {
	
	public static Reservation getReservationByCode(String resCode) {
		return Database.resCodeMap.get(resCode);
	}
	
	public static List<Airport> listOfAirports(){
		return Database.airports;
	}
	
	public static String displayTickets(List<Ticket> tickets) {
		String s = "";
		for (Ticket t : tickets) {
			s += t.getThisTicketNumber() + ": ";
		}
		return s;
	}

	public static String displayFlightInstance(List<FlightInstance> instances) {
		String s = "";
		for (FlightInstance f : instances) {
			s += f.toString() + ": ";
		}
		return s;
	}

	public static void viewReservationDetails(String resCode) {
		Reservation r = getReservationByCode(resCode);
		System.out.println("Displaying Ticket Details ");
		System.out.println("=======================================");
		System.out.println(displayTickets(r.getTickets()) + " ");
		System.out.println("Displaying Flight Details ");
		System.out.println("=======================================");
		System.out.println(displayFlightInstance(r.getFlightInstances()) + " ");
		System.out.println("Displaying Passenger Details ");
		System.out.println("=======================================");
		System.out.println(r.getPassenger().getFirstname() + " " + r.getPassenger().getLastname());
	}
	
	public static void cancelReservation(String resCode) {
		Database.resCodeMap.remove(resCode);
	}

}
