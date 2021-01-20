package service;

import java.util.ArrayList;
import java.util.List;

import frs.FlightInstance;
import frs.Reservation;
import frs.ResourceFactory;
import frs.Ticket;

public class Helper {

	public static String getReservationCode() {

		// logic for generating random six digit alphaNumeric code
		return "";
	}
	
	//upon payment, this method is invoked to issue all tickets of this reservation
	public static List<Ticket> issueTickets(Reservation res){
		List<Ticket> tickets = new ArrayList<>();
		for(FlightInstance f : res.getFlightInstances()) {
			Ticket t = ResourceFactory.createTicket(res.getResCode(),f);
			tickets.add(t);
		}
		return tickets;
	}
}
