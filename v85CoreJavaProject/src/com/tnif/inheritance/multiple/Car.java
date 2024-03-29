package com.tnif.inheritance.multiple;

public class Car extends Vehicle{
	private String carName;
	private String model;
	private float cost;
	
	public Car(String brand,String registrationPlace, String carName, String model, float cost) {
		super(brand, registrationPlace);
		this.carName = carName;
		this.model = model;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", model=" + model + ", cost=" + cost + ", getBrand()=" + getBrand()
				+ ", getRegistrationPlace()=" + getRegistrationPlace() + "]";
	}
	
	
	
	
}
