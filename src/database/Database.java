package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import frs.Airport;
import frs.Flight;
import frs.FlightInstance;
import frs.Reservation;
import frs.Ticket;
import frs.Passenger;

public class Database {

	public static Map<String, Reservation> resCodeMap = new HashMap<>();
	
	public static Map<String, Ticket> ticketNumMap = new HashMap<>();
	
	public static Map<String, List<FlightInstance>> instanceReservationMap = new HashMap<>();
	
	public static List<Airport> airports =new ArrayList<>();
	
	public static List<Flight> flights =new ArrayList<>();
	
	public static List<Passenger> passengers =new ArrayList<>();
}
