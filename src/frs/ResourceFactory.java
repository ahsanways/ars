package frs;

import java.time.LocalDate;
import java.time.LocalTime;

import database.Database;
import service.InsertData;
import service.Resource;

final public class ResourceFactory {

	private ResourceFactory() {

	}
	//CRUD -- CREATE
	public static Passenger createPassenger(String firstname, String lastname, LocalDate dob, String email, Address address) {
		Passenger passenger = new Passenger(firstname, lastname, dob, email, address);
		InsertData.insertPassengerInDatabase(passenger);
		return passenger;
	}
	
	public static Flight createFlight(String number, int capacity, Airport departureAirport, Airport arrivalAirport,
			LocalTime departureTime, LocalTime arrivalTime, Airline airline) {
		Flight flight = new Flight(number, capacity, departureAirport, arrivalAirport, departureTime, arrivalTime, airline);
		InsertData.insertFlightInDatabase(flight);
		return flight;
	}
	
	public static Airline createAirline(String code, String name, String history) {
		Airline airline = new Airline(code, name, history);
		InsertData.insertAirlineInDatabase(airline);
		return airline;
	}
	
	public static Airport createAirport(String code, String name, Address address) {
		Airport airport = new Airport(code, name, address);
		InsertData.insertAirportInDatabase(airport);
		return airport;
	}

	public static Agent createAgent(String name) {
		Agent a = new Agent(name);
		Database.agents.add(a);
		return a;
	}

	public static Reservation getReservationByPassenger(FlightInstance flightInstance, Passenger passenger) {
		// flightInstance = getFlightInstance();
		Reservation reservation = new Reservation(flightInstance, passenger);
		InsertData.insertReservationInDatabase(reservation);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		return reservation;
	}
	
	public static Reservation createReservationByAgent(FlightInstance flightInstance, Passenger passenger, Agent agent) {
		// flightInstance = getFlightInstance();
		Reservation reservation = new Reservation(flightInstance, passenger, agent);
		//Database.instanceReservationMap.put(res, res.getFlightInstances());
		InsertData.insertReservationInDatabase(reservation);
		return reservation;
	}

	public static FlightInstance createFlightInstance(LocalDate date, Flight flight) { 
		FlightInstance f = new FlightInstance(date, flight);
		InsertData.insertFlightInstanceInDatabase(f);
		return f;
	}

	public static Ticket createTicket(String resCode, FlightInstance f) {
		Ticket t = new Ticket(resCode, f);
		InsertData.insertTicketInDatabase(t);
		return t;
	}
}
