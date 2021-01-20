package frs;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Resource {

	List<Ticket> tickets = new ArrayList<>();
	List<FlightInstance> flightInstances;
	Passenger passenger;
	String resCode;
	int agentID;
	
	Reservation(FlightInstance flightInstance){
		this.flightInstances = new ArrayList<>();
		flightInstances.add(flightInstance);
		this.resCode = reservationCode();
		//this.passenger = new Passenger();
	}
	
	public String reservationCode() {
		
		//logic for generating random six digit alphaNumeric code
		return "";
	}
}
