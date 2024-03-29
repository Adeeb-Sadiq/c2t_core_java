package com.tnif.inheritance.multiple;

public class Bike extends Vehicle{
	private String bikeName;
	private String model;
	private float cost;
	
	
	public Bike(String brand, String registrationPlace,String bikeName, String model, float cost) {
		super(brand, registrationPlace);
		this.bikeName = bikeName;
		this.model = model;
		this.cost = cost;		
	}


	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", model=" + model + ", cost=" + cost + ", getBrand()=" + getBrand()
				+ ", getRegistrationPlace()=" + getRegistrationPlace() + "]";
	}
	
	
}
