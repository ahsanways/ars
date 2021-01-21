package frs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private static int passengerId;
	String firstname;
	String lastname;
	LocalDate dob;
	String email;
	Address address;
	List<Reservation> reservations;

	public Passenger(String firstname, String lastname, LocalDate dob, String email, Address address) {
		passengerId++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.email = email;
		this.address = address;
		reservations = new ArrayList<Reservation>();
	}

	public int getId() {
		return passengerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}

	@Override
	public String toString() {
		return "Passenger ID = " + passengerId + ", firstname=" + firstname + ", lastname=" 
				+ lastname + ", dob=" + dob
				+ ", email=" + email + ", address=" + address + " ";
	}
}
