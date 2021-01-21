package frs;
import java.util.ArrayList;
import java.util.List;

public class Airline {
	private static int airlineId;
	String code;
	String name;
	String history;
	List<Flight> flights;
	
	public Airline(String code, String name, String history) {
		airlineId++;
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

//	@Override
//	public String toString() {
//		return "Airline [id=" + id + ", code=" + code + ", name=" + name + ", history=" + history + ", flights="
//				+ flights + "]";
//	}
	
	
}
