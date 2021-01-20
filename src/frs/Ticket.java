package frs;

import service.ReadData;
import service.Resource;

public class Ticket implements Resource {

	private static int ticketID;
	private FlightInstance flightInstance;
	private long ticketNum;
	private Reservation reservation;
	
	//Map resCode to Reservation
	Ticket(String resCode, FlightInstance f){
		ticketID++;
		this.ticketNum = getTicketNumber();
		this.reservation = ReadData.getReservationByCode(resCode);
		this.flightInstance = f;
	}
	
	public int getTicketID() {
		return ticketID;
	}
	
	public Long getTicketNumber() {
		//logic for generating a random 20-digit number
		long x = 123456789;
		
		return x;
	}
	
}
