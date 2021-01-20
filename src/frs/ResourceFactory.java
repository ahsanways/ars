package frs;

final public class ResourceFactory {

	private ResourceFactory(){
		
	}
	
	public static Resource getAgent(String name) {
		return new Agent(name);
	}
	
	public static Resource getReservation(FlightInstance flightInstance) {
		//flightInstance = getFlightInstance();
		return new Reservation(flightInstance);
	}
	
	public static Resource getFlightInstance() {
		return new FlightInstance();
	}
	
	public static Resource getTicket(/*res-code*/) {
		return new Ticket();
	}
	
	//investigate this further
	public static Resource getResource(Resource resource) throws Exception {
		if(resource.getClass() != Reservation.class || 
				resource.getClass() != Ticket.class ||
				resource.getClass() != Address.class ||
				resource.getClass() != Airline.class||
				resource.getClass() != FlightInstance.class||
				resource.getClass() != Flight.class||
				resource.getClass() != Airport.class ||
				resource.getClass() != Passenger.class||
				resource.getClass() != Agent.class)
			throw new IllegalResourceException("Invalid Resource!!");
		
		if(resource.getClass() != Reservation.class)
			return new Reservation(new FlightInstance());
		if(resource.getClass() != Agent.class)
			return new Agent(Agent.class.getName()); //investigate this further
		return new Ticket();
	}
	
}
