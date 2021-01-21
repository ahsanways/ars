package service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import frs.FlightInstance;
import frs.Reservation;
import frs.ResourceFactory;
import frs.Ticket;

public class Helper {

	public static String getReservationCode() {
		return randomString(6);
	}

	public static String randomString(int len) {
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

//	public static List<Reservation> getflightInstanceReservations(FlightInstance f){
//		List<Reservation> list = new ArrayList<>();
//		List<FlightInstance> fs = new ArrayList<>();
//		for(Reservation r : Database.resCodeMap.values()) {
//			fs.addAll(r.getFlightInstances());
//		}
//		
//		for(FlightInstance f1 : fs) {
//			if(f1.equals(f))
//				list.add(e)
//		}
//	}

	// upon payment, this method is invoked to issue all tickets of this reservation
	public static List<Ticket> issueTickets(Reservation res) {
		List<Ticket> tickets = new ArrayList<>();
		for (FlightInstance f : res.getFlightInstances()) {
			Ticket t = ResourceFactory.createTicket(res.getResCode(), f);
			tickets.add(t);
		}
		return tickets;
	}
}
