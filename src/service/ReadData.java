package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import frs.*;

//CRUD - READ
public class ReadData {

	public static Reservation getReservationByCode(String resCode) {
		return Database.resCodeMap.get(resCode);
	}

	public static List<FlightInstance> getFlightsByDepartureArrival(String departureAirportCode,
			String arrivalAirportCode, LocalDate date) {
		List<FlightInstance> flightInstances = new ArrayList<>();
		
		for (FlightInstance f : Database.flightInstances) {
			
			if (f.getFlight().getDepartureAirport().getCode().equals(departureAirportCode)
					&& f.getFlight().getArrivalAirport().getCode().equals(arrivalAirportCode)
					&& f.getDate().compareTo(date)==0) {
				flightInstances.add(f);
			}
		}
		return flightInstances;
	}

	public static List<Reservation> getReservationByPassenger(int id) {
		List<Reservation> reservations = new ArrayList<Reservation>();
		for (Passenger p : Database.passengers) {
			if (p.getId() == id) {
				reservations.addAll(p.getReservations());
			}
		}
		return reservations;
	}

	public static List<Airport> listOfAirports() {
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

	public static void viewTicketDetails(String resCode) {
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
	
	public static void viewReservationDetails(String resCode) {
		Reservation r = getReservationByCode(resCode);
		System.out.println("Displaying Flight Details ");
		System.out.println("===================================================================");
		System.out.println(displayFlightInstance(r.getFlightInstances()) + " ");
		System.out.println("Displaying Passenger Details ");
		System.out.println("===================================================================");
		System.out.println(r.getPassenger().getFirstname() + " " + r.getPassenger().getLastname());
		System.out.println("*******************************************************************");
		System.out.println("\n\n");
	}

	public static boolean cancelReservation(String resCode) {
		Database.resCodeMap.remove(resCode);
		return Database.resCodeMap.containsKey(resCode);
		
		
	}

	// Outputs list of airlines flying out of a certain airport through the airport
	// code
	public static List<Airline> airlinesFlyingOutOfAirport(String airportCode) {
		List<Airline> specificAirlineList = new ArrayList<>();
		for (Flight f : Database.flights) {
			if (f.getDepartureAirport().getCode().equals(airportCode)) {
				specificAirlineList.add(f.getAirline());
			}
		}
		return specificAirlineList;
	}

	// SELECT RESERVATIONS WHERE AGENT ID IS '163'
	public static List<Reservation> getReservationsByAgent(int agentID) {
		List<Reservation> listOfReservation = new ArrayList<>();

		for (Reservation r : Database.resCodeMap.values()) {
			if (agentID == r.getAgentID()) {
				listOfReservation.add(r);
			}
		}
		return listOfReservation;
	}
}
