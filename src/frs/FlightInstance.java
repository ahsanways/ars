package frs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import service.Resource;

public class FlightInstance implements Resource {
	private int flightInstanceId;
	public static int index = 1;
	LocalDate date;
	Flight flight;
	List<Reservation> reservations;
	// List<Ticket> tickets1;

	public FlightInstance(LocalDate date, Flight flight) {

		this.flightInstanceId = index++;
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
		return flight.getDepartureTime() + " - " + 
	flight.getArrivalTime() + 
	flight.getDepartureAirport().getName() + 
	" to " + flight.getArrivalAirport().getName() + 
	"\n Date: " + date +" \tDeparture: ";
	}

}
