package service;

import database.Database;

public class DeleteData {
	
	//CRUD -- DELETE
	public static void deletePassenger(int passengerId) {
		Database.passengers.remove(passengerId);
	}
	
	public static void deleteAirport(int airportId) {
		Database.airports.remove(airportId);
	}
	
	public static void deleteAirline(int airlineId) {
		Database.airlines.remove(airlineId);
	}
	
	public static void deleteFlight(int flightId) {
		Database.flights.remove(flightId);
	}
	
	public static void deleteFlightInstance(int flightInstanceId) {
		Database.flightInstances.remove(flightInstanceId);
	}
	
	public static void deleteReservation(String resCode) {
		Database.resCodeMap.remove(resCode);
	}
	
	public static void deleteTicket(String ticketNum) {
		Database.ticketNumMap.remove(ticketNum);
	}
}
