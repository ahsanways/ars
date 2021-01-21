package frs;

import java.util.ArrayList;
import java.time.LocalTime;
import java.util.List;

public class Flight {
	private static int flightId;
	String number;
	int capacity;
	Airport departureAirport;
	Airport arrivalAirport;
	LocalTime departureTime;
	LocalTime arrivalTime;
	List<FlightInstance> flightInstances;
	Airline airline;

	public Flight(String number, int capacity, Airport departureAirport, Airport arrivalAirport,
			LocalTime departureTime, LocalTime arrivalTime, Airline airline) {
		flightId++;
		this.number = number;
		this.capacity = capacity;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightInstances = new ArrayList<FlightInstance>();
		this.airline = airline;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public int getId() {
		return flightId;
	}

	public String getNumber() {
		return number;
	}

	public int getCapacity() {
		return capacity;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public List<FlightInstance> getFlightInstances() {
		return flightInstances;
	}

//	@Override
//	public String toString() {
//		return "Flight [id=" + id + ", number=" + number + ", capacity=" + capacity + ", departureAirport="
//				+ departureAirport + ", arrivalAirport=" + arrivalAirport + ", departureTime=" + departureTime
//				+ ", arrivalTime=" + arrivalTime + ", flightInstances=" + flightInstances + "]";
//	}

}
