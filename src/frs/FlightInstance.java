package frs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import service.Resource;

public class FlightInstance implements Resource {
	private static int flightInstanceId;
	LocalDate date;
	Flight flight;
	List<Reservation> reservations;
	//List<Ticket> tickets1;
	
	
	public FlightInstance(LocalDate date, Flight flight) {
		//this.id = id;
		flightInstanceId++;
		this.date = date;
		this.flight = flight;
		this.reservations = new ArrayList<Reservation>();
	}
	
	public int getId() {
		return flightInstanceId;
	}

	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public List<Reservation> getReservations() {
		return reservations;
	}

	@Override
	public String toString() {
		return  "InstanceID: " + this.getId() + " " +"Date: " + this.getDate() + " " + "InstanceID: " + this.flight.toString() + " ";
	}
	
}
