package frs;

final public class ResourceFactory {

	private ResourceFactory(){
		
	}
	
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
