package frs;

import java.util.ArrayList;
import java.util.List;

import service.Resource;
import service.Helper;
import database.Database;

public class Reservation implements Resource {

	List<Ticket> tickets;
	List<FlightInstance> flightInstances;
	Passenger passenger;
	String resCode;
	int agentID;
	
	Reservation(FlightInstance flightInstance, Passenger passenger){
		this.flightInstances = new ArrayList<>();
		flightInstances.add(flightInstance);
		this.resCode = Helper.getReservationCode();
		//this.passenger = new Passenger();
	}
	
	public List<Ticket> issueTickets(Reservation res){
		for(FlightInstance f : flightInstances) {
			Ticket t = ResourceFactory.getTicket(resCode,f);
			tickets.add(t);
		}
		return tickets;
	}
	
//	private boolean confirmReservation() {
//		
//	}
}
