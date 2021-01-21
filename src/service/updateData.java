package service;
import java.time.LocalDate;
import java.util.List;

import database.Database;
import frs.Address;
import frs.Reservation;
import frs.Passenger;
public class updateData {
	public static void updatePassenger(int passengerId,String firstname,String lastname,LocalDate dob,String email,Address address,List<Reservation> res) {
//		Passenger p = Database.passengers.get(passengerId);
//		p.setFirstname(firstname);
//		p.setLastname(lastname);
//		p.setEmail(email);
		Database.passengers.get(passengerId).setFirstname(firstname);
		Database.passengers.get(passengerId).setLastname(lastname);
		Database.passengers.get(passengerId).setEmail(email);

	}
}
