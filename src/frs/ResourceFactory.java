package frs;

import java.time.LocalDate;
import java.time.LocalTime;

import database.Database;
import service.Resource;

final public class ResourceFactory {

	private ResourceFactory() {

	}
	
	public static Passenger createPassenger(String firstname, String lastname, LocalDate dob, String email, Address address) {
		Passenger passenger = new Passenger(firstname, lastname, dob, email, address);
		Database.passengers.add(passenger);
		return passenger;
	}
	
	public static Flight createFlight(String number, int capacity, Airport departureAirport, Airport arrivalAirport,
			LocalTime departureTime, LocalTime arrivalTime, Airline airline) {
		Flight flight = new Flight(number, capacity, departureAirport, arrivalAirport, departureTime, arrivalTime, airline);
		Database.flights.add(flight);
		return flight;
	}
	
	public static Airline createAirline(String code, String name, String history) {
		Airline airline = new Airline(code, name, history);
		return airline;
	}
	
	public static Airport createAirport(String code, String name, Address address) {
		Airport airport = new Airport(code, name, address);
		Database.airports.add(airport);
		return airport;
	}

	public static Agent createAgent(String name) {
		Agent a = new Agent(name);
		Database.agents.add(a);
		return a;
	}

	public static Reservation getReservationByPassenger(FlightInstance flightInstance, Passenger passenger) {
		// flightInstance = getFlightInstance();
		Reservation res = new Reservation(flightInstance, passenger);
		Database.resCodeMap.put(res.getResCode(), res);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		return res;
	}
	
	public static Reservation createReservationByAgent(FlightInstance flightInstance, Passenger passenger, Agent agent) {
		// flightInstance = getFlightInstance();
		Reservation res = new Reservation(flightInstance, passenger, agent);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		Database.resCodeMap.put(res.getResCode(), res);
		return res;
	}

	public static FlightInstance createFlightInstance(LocalDate date, Flight flight) { 
		FlightInstance f = new FlightInstance(date, flight);
		Database.flightInstances.add(f);
		return f;
	}

	public static Ticket createTicket(String resCode, FlightInstance f) {
		Ticket t = new Ticket(resCode, f);
		Database.ticketNumMap.put(t.getThisTicketNumber(), t);
		return t;
	}
	
	
}
