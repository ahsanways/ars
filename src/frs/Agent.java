package frs;

import service.Resource;

public class Agent implements Resource {
	public static int index = 1;
	private int agentID; //primary key --> AUTO INCREMENT
	String name; //both firstname and last name
	
	protected Agent(String name){
		this.agentID = index++;
		this.name = name;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String getName() {
		return this.name;
	}
}
