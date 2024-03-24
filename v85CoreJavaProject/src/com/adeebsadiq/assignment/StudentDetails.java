package com.adeebsadiq.assignment;

import java.util.Scanner;

//main function is included in class
public class StudentDetails {
	private String fullName;
	private String rollNumber;
	private String grade;
	private float percentage;
	
	public StudentDetails() {
		System.out.println("A student object is created for student to demonstrate default constructor");
	}
	
	public void details() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter full name:");
		this.fullName = s.nextLine();
		System.out.println("Enter the roll number");
		this.rollNumber = s.next();
		System.out.println("Enter the grade");
		this.grade = s.next();
		System.out.println("Enter the percentage");
		this.percentage = s.nextFloat();
		System.out.println("The entered details are:");
		System.out.println(this.fullName);
		System.out.println(this.rollNumber);
		System.out.println(this.grade);
		System.out.println(this.percentage);
	}
	
	public static void main(String[] args) {
		StudentDetails obj = new StudentDetails();
		obj.details();
	}
}
