package frs;

import service.Resource;

public class Agent implements Resource {

	private static int agentID; //primary key --> AUTO INCREMENT
	String name; //both firstname and last name
	
	protected Agent(String name){
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
