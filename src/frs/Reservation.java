package frs;

import java.util.ArrayList;
import java.util.List;

import service.Resource;
import service.Helper;
import database.Database;

public class Reservation implements Resource {

	List<Ticket> tickets;
	private List<FlightInstance> flightInstances;
	Passenger passenger;
	private String resCode;
	int agentID;

	Reservation(FlightInstance flightInstance, Passenger passenger) {
		this.flightInstances = new ArrayList<>();
		flightInstances.add(flightInstance);
		this.resCode = Helper.getReservationCode();
		this.passenger = passenger;
	}

	Reservation(FlightInstance flightInstance, Passenger passenger, Agent agent) {
		this.flightInstances = new ArrayList<>();
		flightInstances.add(flightInstance);
		this.resCode = Helper.getReservationCode();
		this.passenger = passenger;
		this.agentID = agent.getAgentID();
	}

	public int getAgentID() {
		return agentID;
	}

	public List<FlightInstance> getFlightInstances() {

		return this.flightInstances;
	}

	public String getResCode() {
		return this.resCode;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}

	public List<Ticket> getTickets() {
		this.tickets = Helper.issueTickets(this);
		return tickets;
	}
}
