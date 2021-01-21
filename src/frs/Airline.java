package frs;

import java.util.ArrayList;
import java.util.List;

public class Airline {
	public static int index = 1;
	private int airlineId;
	String code;
	String name;
	String history;
	List<Flight> flights;

	public Airline(String code, String name, String history) {
		this.airlineId = index++;
		this.code = code;
		this.name = name;
		this.history = history;
		this.flights = new ArrayList<Flight>();
	}

	public int getId() {
		return airlineId;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getHistory() {
		return history;
	}

	public void setFlight(Flight flight) {
		flights.add(flight);
	}

	public void setFlights(List<Flight> fs) {
		flights.addAll(fs);
	}

	public List<Flight> getFlights() {
		return flights;
	}

	@Override
	public String toString() {
		return airlineId + ". Airline Code: " + code +" \tName: " + name;
	}

}
