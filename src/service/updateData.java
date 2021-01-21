package service;
import java.time.LocalDate;
import java.util.List;

import database.Database;
import frs.Address;
import frs.Reservation;
import frs.Passenger;
public class updateData {
	public static boolean updatePassenger(int passengerId,String firstname,String lastname,String email) {
		for(Passenger p : Database.passengers) {
			if(p.getId() == passengerId) {
				p.setFirstname(firstname);
				p.setLastname(lastname);
				p.setEmail(email);
			}
		}
		return true;

	}
}
