package com.adeebsadiq.assignment.employees;

public class Developer extends Employee{
	private int age;
	private String bloodGroup;
	private int projectsMade;
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
	public int getProjectsMade() {
		return projectsMade;
	}
	public void setProjectsMade(int projectsMade) {
		this.projectsMade = projectsMade;
	}
	
	@Override
	public String toString() {
		return "Developer [age=" + age + ", bloodGroup=" + bloodGroup + ", projectsMade=" + projectsMade + "]";
	}
	
	
}
