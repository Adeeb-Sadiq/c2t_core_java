package com.adeebsadiq.assignment;
//main function is included in this class.

import java.util.Scanner;

public class Commission {	
	//data members:
	private String name;
	private String address;
	private long phno;
	public float salesAmount;
	
	public Commission() {
		System.out.println("Commission object is created");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		this.name = sc.nextLine();
		System.out.println("Enter address:");
		this.address = sc.nextLine();
		System.out.println("Enter phone number");
		this.phno = sc.nextLong();
		System.out.println("sales amount");
		this.salesAmount = sc.nextFloat();
	}
	public void calCommission(float commission) {
		System.out.println(commission);
		if (commission >= 100000) {
			commission = commission*10/100;
			System.out.println("Commission: " + commission);
		}
		else if (commission >= 50000) {
			commission = commission*5/100;
			System.out.println("commission: " + commission);
		}
		else if (commission >= 30000) {
			commission = commission*3/100;
			System.out.println("Commission: " + commission);
		}
		else if (commission <30000) {
			System.out.println("No commission");
		}
		else {
			System.out.println("Commission invalid");
		}
	}
	
	public static void main(String[] args) {
		//creating a student object to demonstrate a default constructor
		StudentDetails s = new StudentDetails();
		Commission c = new Commission();
		c.calCommission(c.salesAmount);
	}
}