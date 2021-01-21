package frs;

import java.util.ArrayList;
import java.util.List;

public class Airport {
	public static int AirportId;
	String code;
	String name;
	Address address;
	List<Flight> flights;

	public Airport(String code, String name, Address address) {
		AirportId++;
		this.code = code;
		this.name = name;
		this.address = address;
		flights = new ArrayList<Flight>();
	}

	public int getId() {
		return AirportId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Flight> getFlights(){
		return flights;
	}
	
	public void addFlight(Flight flight) {
		this.flights.add(flight);
	}

//	@Override
//	public String toString() {
//		return "Airport [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + "]";
//	}

}
