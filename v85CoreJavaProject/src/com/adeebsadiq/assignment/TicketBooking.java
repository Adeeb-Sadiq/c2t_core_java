package com.adeebsadiq.assignment;

import java.util.Scanner;

//main function is included
public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	private Double amount;
	private String walletNumber;
	private String creditCard;
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	public TicketBooking() {
		System.out.println("Enter the user name: ");
		this.customer = sc.nextLine();
		System.out.println("Enter the event name: ");
		this.stageEvent = sc.nextLine();
		System.out.println("Enter the no of seats needed: ");
		this.noOfSeats = sc.nextInt();
		chooseMethod();
	}
	
	public TicketBooking(String stageEvent,String customer, int noofseats) {
		this.customer = stageEvent;
		this.stageEvent = customer;
		this.noOfSeats = noofseats;
	}
	
	public void makePayment(Double amount) {
		this.amount = amount;
		
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Amount: " + this.amount);
	}
	
	public void makePayment(String walletNumber, Double amount) {
		this.amount = amount;
		this.walletNumber = walletNumber;
		
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Amount: " + this.amount + " paid using wallet");
		System.out.println("Wallet no: " + this.walletNumber);
	}
	
	public void makePayment(String creditCard, String name, Double amount) {
		this.creditCard = creditCard;
		this.name = name;
		this.amount = amount;
		
		System.out.println("Stage event: " + this.stageEvent);
		System.out.println("Customer: " + this.customer);
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Holder name: " + this.name);
		System.out.println("Amount: " + this.amount + " paid using credit card");
		System.out.println("ccv no: " + this.creditCard);
	}
	
	public void chooseMethod() {
		System.out.println("Choose Payment method:\n1.Cash\n2.Online Wallet\n3.Credit Card");
		int option;
		option = sc.nextInt();
		if (option == 1) {
			System.out.println("Enter the amount: ");
			Double a = sc.nextDouble();
			makePayment(a);
		}
		else if (option == 2) {
			System.out.println("Enter the amount:");
			Double a = sc.nextDouble();
			System.out.println("Enter wallet number: ");
			String w = sc.next();
			makePayment(w,a);
		}
		else if (option == 3) {
			System.out.println("Enter the amount: ");
			Double a = sc.nextDouble();
			System.out.println("Enter card holder name: ");
			String n = sc.next();
			System.out.println("Enter credit card number:");
			String c = sc.next();
			makePayment(c,n,a);
		}
		else {
			System.out.println("Invalid Input, try again.");
		}
	}

	@Override
	public String toString() {
		return "TicketBooking [stageEvent=" + stageEvent + ", customer=" + customer + ", noOfSeats=" + noOfSeats
				+ ", amount=" + amount + ", walletNumber=" + walletNumber + ", creditCard=" + creditCard + ", name="
				+ name + "]";
	}

	public static void main(String[] args) {
		TicketBooking obj2 = new TicketBooking("John Wick","John",2);
		System.out.println(obj2);
		
		TicketBooking obj1 = new TicketBooking();
	}
	
	
	
	
	
	
	
}
