package com.tnif.inheritance.multiLevel;

public class State extends Country {
	private String stateName;
	private int area;
	
	public State(String statename, int area, String cn, String cc) {
		super(cn,cc);
		this.stateName = statename;
		this.area = area;
	}

	public String getStateName() {
		return stateName;
	}

	public int getArea() {
		return area;
	}
	
}
