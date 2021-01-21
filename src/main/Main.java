package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import frs.*;

import service.ReadData;

public class Main {

	public static void main(String[] args) {
		// populating data

		
		System.out
				.println("\n========================= Welcome to Airline Reservation System ========================");
		final String PASSWORD = "password";
		int attempts = 3;
		String password = "";
		String userType = "";
		while (attempts-- > 0 && !PASSWORD.equals(password)) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\nEnter user name => ");
			String userName = scanner.nextLine();

			System.out.print("Enter password => ");
			password = scanner.nextLine();

			if ("ahsan".equals(userName) && password.equals(PASSWORD)) {
				System.out.println("\nUser successfully logged-in (Passenger) .. ");
				userType = "passenger";
			} else if ("henry".equals(userName) && password.equals(PASSWORD)) {
				System.out.println("\nUser successfully logged-in (Admin) ..");
				userType = "admin";
			} else if ("sanjeevan".equals(userName) && password.equals(PASSWORD)) {
				System.out.println("\nUser successfully logged-in.. (Agent)");
				userType = "agent";
			} else {
				System.out.println("Invalid userName of password ");
			}
		}

		switch (userType) {
		case "passenger":
			showPassengerMenu();
			break;
		case "admin":
			showAdminMenu();
			break;
		case "agent":
			showAgentMenu();
			break;
		default:
			System.out.println("Invalid user type: " + userType);
		}
	}

	public static void showPassengerMenu() {
		
		Address add1 = new Address(1, "A", "B", "C", "D");
		Passenger p1 = ResourceFactory.createPassenger("Ahsan", "Waseem", LocalDate.of(1998, 2, 14), "awaseem@miu.edu", add1);
		Passenger p2 = ResourceFactory.createPassenger("Henry", "Kato", LocalDate.of(1998, 2, 13), "hkato@miu.edu", add1);
		
		Airport a1 = ResourceFactory.createAirport("ABC", "Crazy Airport", add1);
		Airport a2 = ResourceFactory.createAirport("DEF", "Really Crazy Airport", add1);

		Airline ar1 = ResourceFactory.createAirline("QR", "Qatar Airways", "what is this");
		Airline ar2 = ResourceFactory.createAirline("AA", "American Airlines", "what is this");

		Flight fl1 = ResourceFactory.createFlight("3RW", 300, a1, a2, LocalTime.parse("03:18:00"),
				LocalTime.parse("05:47:00"), ar1);
		Flight fl2 = ResourceFactory.createFlight("5TY", 500, a2, a1, LocalTime.parse("02:07:00"),
				LocalTime.parse("08:45:00"), ar2);
		
		FlightInstance fli1 = ResourceFactory.createFlightInstance(LocalDate.of(2017, 1, 13), fl1);
		FlightInstance fli2 = ResourceFactory.createFlightInstance(LocalDate.of(2018, 1, 13), fl2);
		FlightInstance fli3 = ResourceFactory.createFlightInstance(LocalDate.of(2019, 1, 13), fl1);
		FlightInstance fli4 = ResourceFactory.createFlightInstance(LocalDate.of(2021, 1, 13), fl2);
		
		Reservation r = ResourceFactory.getReservationByPassenger(fli1, p1);
		Reservation r2 = ResourceFactory.getReservationByPassenger(fli2, p1);
		String reservationCode = r.getResCode();
		p1.addReservation(r);
		p1.addReservation(r2);
		
		
		while (true) {
			System.out.println("\n1. View List of all Aiports");
			System.out.println("\n2. View List of all Airlines");
			System.out.println("\n3. View List of Flights between departure and destination");
			System.out.println("\n4. View List of my Reservations");
			System.out.println("\n5. View details of a Reservations");
			System.out.println("\n6. Make a Reservations");
			System.out.println("\n7. Cancel a Reservation");
			System.out.println("\n8. Confirm and purchase a reservation");
			System.out.println("\nSelect an option to continue...");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				// view all airports
				
				for (Airport a : ReadData.listOfAirports()) {
					System.out.println(a);
				}

				break;
			case 2:
				// list of airlines from departure airport
				// get airport code from the console
				for (Airline a : ReadData.airlinesFlyingOutOfAirport("ABC")) {
					System.out.println(a);
				}
				break;
			case 3:
				// list of flights for dept airport arrival airport and date
				
				for(FlightInstance fl : ReadData.getFlightsByDepartureArrival("ABC", "DEF", LocalDate.of(2019, 1, 13))) {
					System.out.println(fl);
				}
				
				break;
			case 4:
				// make a reservation
				
				ReadData.viewReservationDetails(r.getResCode());
				System.out.println(r.getResCode());
				break;
			case 5:
				// view reservation with reservation code
				ReadData.viewReservationDetails(reservationCode);
				break;
			case 6:
				// cancel reservation
				ReadData.cancelReservation(reservationCode);
				System.out.println("Reservation canceled!");
				break;
			case 7:
				// view own reservations
				for(Reservation x : p1.getReservations()) {
					ReadData.viewReservationDetails(x.getResCode());
					System.out.println("***********************************************************************************");
					System.out.println(
							"***********************************************************************************");
				}
				
				break;
			case 8:
				
				System.out.println("hey");
				break;
			default:
				System.out.println("Invalid option selected: " + option);
			}
			scanner.next();
		}

	}

	public static void showAdminMenu() {
		System.out.println("\n1. Do Task 1 for Admin");
		System.out.println("\n2. Do Task 2 for Admin");
		System.out.println("\n3. Do Task 3 for Admin");
		System.out.println("\n4. Do Task 4 for Admin");
		System.out.println("\nSelect an option to continue...");
	}

	public static void showAgentMenu() {
		System.out.println("\n1. View List of all Aiports");
		System.out.println("\n2. View List of all Airlines");
		System.out.println("\n3. View List of Flights between departure and destination");
		System.out.println("\n4. View List of my Reservations");
		System.out.println("\n5. View details of a Reservations");
		System.out.println("\n6. Make a Reservations");
		System.out.println("\n7. Cancel a Reservation");
		System.out.println("\n8. Confirm and purchase a reservation");
		System.out.println("\n9. View List of Passengers and their reservations");
		System.out.println("\nSelect an option to continue...");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			System.out.println("hey");
			break;
		case 2:
			System.out.println("hey");
			break;
		case 3:
			System.out.println("hey");
			break;
		case 4:
			System.out.println("hey");
			break;
		case 5:
			System.out.println("hey");
			break;
		case 6:
			System.out.println("hey");
			break;
		case 7:
			System.out.println("hey");
			break;
		case 8:
			System.out.println("hey");
			break;
		case 9:
			System.out.println("hey");
			break;
		default:
			System.out.println("Invalid option selected: " + option);
		}
	}

}
