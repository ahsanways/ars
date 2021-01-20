package frs;

import service.ReadData;
import service.Resource;
import database.Database;

final public class ResourceFactory {

	private ResourceFactory() {

	}

	public static Resource getAgent(String name) {
		return new Agent(name);
	}

	public static Resource getReservation(FlightInstance flightInstance, Passenger passenger) {
		// flightInstance = getFlightInstance();
		Reservation res = new Reservation(flightInstance, passenger);
		Database.resCodeMap.put(res.resCode, res);
		return res;
	}

//	public static Resource getFlightInstance() {
//		return new FlightInstance();
//	}

	public static Ticket getTicket(String resCode, FlightInstance f) {
		Ticket t = new Ticket(resCode, f);
		Database.ticketNumMap.put(t.getTicketNumber(), t);
		return t;
	}
}
