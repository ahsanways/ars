package frs;

public class Ticket implements Resource {

	private static int ticketID;
	private FlightInstance flightInstance;
	private long ticketNum;
	
	//Map resCode to Reservation
	Ticket(/*String resCode*/){
		ticketID++;
		this.ticketNum = getTicketNumber();
		//give it a flight instance as well
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
