package service;

import java.util.ArrayList;
import java.util.List;

import database.Database;
import frs.*;

public class ReadData {

	public static Reservation getReservationByCode(String resCode) {
		return Database.resCodeMap.get(resCode);
	}

	// Outputs list of airlines flying out of a certain airport through the airport
	// code
	public static List<Airline> airlinesFlyingOutOfAirport(String airportCode){
		List<Airline> specificAirlineList = new ArrayList<>();
		for(Flight f: Database.flights) {
			if(f.getDepartureAirport().getCode().equals(airportCode)) {
				specificAirlineList.add(f.getAirline());
			}
		}
		return specificAirlineList;
	}

	// SELECT RESERVATIONS WHERE AGENT ID IS '163'
	public static List<Reservation> getReservationsByAgent(int agentID) {
		List<Reservation> listOfReservation = new ArrayList<>();
		
		for(Reservation r : Database.resCodeMap.values()) {
			if(agentID == r.getAgentID()) {
				listOfReservation.add(r);
			}
		}
		return listOfReservation;
	}

}
