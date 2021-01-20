package frs;
import java.util.ArrayList;
import java.util.List;

public class Airline {
	String id;
	String code;
	String name;
	String history;
	List<Flight> flights;
	
	public Airline(String id, String code, String name, String history) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.history = history;
		this.flights = new ArrayList<Flight>();
	}

	public String getId() {
		return id;
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

	public List<Flight> getFlights() {
		return flights;
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", code=" + code + ", name=" + name + ", history=" + history + ", flights="
				+ flights + "]";
	}
	
	
}
