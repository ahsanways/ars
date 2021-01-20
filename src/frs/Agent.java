package frs;

public class Agent implements Resource {

	private static int agentID; //primary key --> AUTO INCREMENT
	String name; //both firstname and last name
	
	Agent(String name){
		agentID++;
		this.name = name;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String getName() {
		return this.name;
	}
}
