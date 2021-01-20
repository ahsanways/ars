package database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import frs.FlightInstance;
import frs.Reservation;
import frs.Ticket;

public class Database {

	public static Map<String, Reservation> resCodeMap = new HashMap<>();
	
	public static Map<Long, Ticket> ticketNumMap = new HashMap<>();
	
	public static Map<FlightInstance, List<Ticket>> ticketInstance = new HashMap<>(); 

}
