package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n========================= Welcome to Airline Reservation System ========================");
		final String PASSWORD = "password";
		int attempts = 3;
		String password = "";
		String userType="";
		while (attempts-- > 0 && !PASSWORD.equals(password)) {
			Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter user name => ");
            String userName = scanner.nextLine();
            	
            System.out.print("Enter password => ");
            password = scanner.nextLine();
            
            if ("ahsan".equals(userName) && password.equals(PASSWORD)) {
                System.out.println("\nUser successfully logged-in (Passenger) .. ");
                userType = "passenger";
            } 
            else if ("henry".equals(userName) && password.equals(PASSWORD)) {
                System.out.println("\nUser successfully logged-in (Admin) ..");
                userType = "admin";
            } 
            else if ("sanjeevan".equals(userName) && password.equals(PASSWORD)) {
                System.out.println("\nUser successfully logged-in.. (Agent)");
                userType = "agent";
            } 
            else {
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
		while(true) {
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
		        default:
		        	System.out.println("Invalid option selected: " + option);
			}
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
