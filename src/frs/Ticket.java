package frs;

import java.util.Random;

import service.ReadData;
import service.Resource;

public class Ticket implements Resource {

	private static int ticketID;
	private FlightInstance flightInstance;
	private String ticketNum;
	private Reservation reservation;
	
	//Map resCode to Reservation
	Ticket(String resCode, FlightInstance f){
		ticketID++;
		this.ticketNum = getTicketNumber(20);
		this.reservation = ReadData.getReservationByCode(resCode);
		this.flightInstance = f;
	}
	
	public int getTicketID() {
		return ticketID;
	}
	
	public String getTicketNumber(int length) {
		//logic for generating a random 20-digit number
		Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
	}
}
