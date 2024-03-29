package com.adeebsadiq.assignment;

import java.util.Scanner;

//main function is included
public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	Scanner sc = new Scanner(System.in);
	
	public TicketBooking() {
		System.out.println("Enter the user name: ");
		this.customer = sc.nextLine();
		System.out.println("Enter the event name: ");
		this.stageEvent = sc.nextLine();
		System.out.println("Enter the no of seats needed: ");
		this.noOfSeats = sc.nextInt();
	}
	
	public TicketBooking(String stageEvent,String customer, int noofseats) {
		this.customer = stageEvent;
		this.stageEvent = customer;
		this.noOfSeats = noofseats;
	}

	
	
	@Override
	public String toString() {
		return "TicketBooking [stageEvent=" + stageEvent + ", customer=" + customer + ", noOfSeats=" + noOfSeats + "]";
	}

	public static void main(String[] args) {
		TicketBooking obj1 = new TicketBooking();
		TicketBooking obj2 = new TicketBooking("John Wick","John",2);
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	
}
