package frs;

import java.time.LocalDate;
import java.time.LocalTime;

import database.Database;
import service.Resource;

final public class ResourceFactory {

	private ResourceFactory() {

	}
	
	public static Passenger getPassenger(String firstname, String lastname, LocalDate dob, String email, Address address) {
		Passenger passenger = new Passenger(firstname, lastname, dob, email, address);
		
		return passenger;
	}
	
	public static Flight getFlight(String number, int capacity, Airport departureAirport, Airport arrivalAirport,
			LocalTime departureTime, LocalTime arrivalTime) {
		Flight flight = new Flight(number, capacity, departureAirport, arrivalAirport, departureTime, arrivalTime);
		Database.flights.add(flight);
		return flight;
	}
	
	public static Airline getAirline(String code, String name, String history) {
		Airline airline = new Airline(code, name, history);
		return airline;
	}
	
	public static Airport getAirport(String code, String name, Address address) {
		Airport airport = new Airport(code, name, address);
		Database.airports.add(airport);
		return airport;
	}

	public static Resource getAgent(String name) {
		return new Agent(name);
	}

	public static Reservation getReservationByPassenger(FlightInstance flightInstance, Passenger passenger) {
		// flightInstance = getFlightInstance();
		Reservation res = new Reservation(flightInstance, passenger);
		Database.resCodeMap.put(res.getResCode(), res);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		return res;
	}
	
	public static Reservation getReservationByAgent(FlightInstance flightInstance, Passenger passenger, Agent agent) {
		// flightInstance = getFlightInstance();
		Reservation res = new Reservation(flightInstance, passenger);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		Database.resCodeMap.put(res.getResCode(), res);
		return res;
	}

	public static FlightInstance getFlightInstance(LocalDate date, Flight flight) { 
		return new FlightInstance(date, flight);
	}

	public static Ticket createTicket(String resCode, FlightInstance f) {
		Ticket t = new Ticket(resCode, f);
		Database.ticketNumMap.put(t.getThisTicketNumber(), t);
		return t;
	}
}
