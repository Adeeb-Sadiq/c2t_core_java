package com.adeebsadiq.assignment.employees;

public class Manager extends Employee {
	private int age;
	private String bloodGroup;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "Manager [age=" + age + ", bloodGroup=" + bloodGroup + "]";
	}
	
	
}
