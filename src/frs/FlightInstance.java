package frs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import service.Resource;

public class FlightInstance implements Resource {
	String id;
	LocalDate date;
	Flight flight;
	List<Reservation> reservations;
	//List<Ticket> tickets1;
	
	
	public FlightInstance(String id, LocalDate date, Flight flight) {
		super();
		this.id = id;
		this.date = date;
		this.flight = flight;
		this.reservations = new ArrayList<Reservation>();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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
		return "FlightInstance [id=" + id + ", date=" + date + ", flight=" + flight + ", reservations=" + reservations
				+ "]";
	}
	
}
