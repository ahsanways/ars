package service;

import database.Database;
import frs.*;
import frs.Passenger;

public class InsertData {

	public static void insertPassengerInDatabase(Passenger passenger) {
		Database.passengers.add(passenger);
	}
	
	public static void insertFlightInDatabase(Flight flight) {
		Database.flights.add(flight);
	}
	
	public static void insertAirlineInDatabase(Airline airline) {
		Database.airlines.add(airline);
	}
	
	public static void insertAirportInDatabase(Airport airport) {
		Database.airports.add(airport);
	}
	
	public static void insertReservationInDatabase(Reservation reservation) {
		Database.resCodeMap.put(reservation.getResCode(), reservation);
	}
	
	public static void insertFlightInstanceInDatabase(FlightInstance flt) {
		Database.flightInstances.add(flt);
	}
	
	public static void insertTicketInDatabase(Ticket ticket) {
		Database.ticketNumMap.put(ticket.getThisTicketNumber(), ticket);
	}
}
