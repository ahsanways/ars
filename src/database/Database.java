package database;

import java.util.HashMap;
import java.util.Map;

import frs.Reservation;
import frs.Ticket;

public class Database {

	public static Map<String, Reservation> resCodeMap = new HashMap<>();
	
	public static Map<Long, Ticket> ticketNumMap = new HashMap<>();

}
