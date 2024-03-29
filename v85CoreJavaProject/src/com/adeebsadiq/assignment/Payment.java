package com.adeebsadiq.assignment;

import java.util.Scanner;

// main included in this class
public class Payment {
	private String userName;
	private String paymentMethod;
	private float amount;
	private long upiId;
	private String cardNumber;
	
	public Payment(String userName, String paymentMethod, float amount) {
		this.userName = userName;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		generateReceipt();
	}
	
	public Payment(String userName, String paymentMethod, float amount,long upiID) {
		this.userName = userName;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.upiId = upiID;
		generateReceipt(upiId);
	}
	
	public Payment(String userName, String paymentMethod, float amount,String cardNo) {
		this.userName = userName;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.cardNumber = cardNo;
		generateReceipt(cardNo);
	}
	
	public void generateReceipt() {
		System.out.println("Receipt:");
		System.out.println("Username: " + this.userName);
		System.out.println("Amoutn: " + this.amount);
		System.out.println("Payment Method: " + this.paymentMethod);
		System.out.println();
	}
	
	public void generateReceipt(long uId) {
		System.out.println("Receipt:");
		System.out.println("Username: " + this.userName);
		System.out.println("Amoutn: " + this.amount);
		System.out.println("Payment Method: " + this.paymentMethod);
		System.out.println("UpiID: " + uId);
		System.out.println();
	}
	
	public void generateReceipt(String cNo) {
		System.out.println("Receipt:");
		System.out.println("Username: " + this.userName);
		System.out.println("Amoutn: " + this.amount);
		System.out.println("Payment Method: " + this.paymentMethod);
		System.out.println("Card Number: " + cNo);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		String username;
		String mode;
		float amount;
		long upi;
		String cardno;
		
		System.out.println("Thanks for confirming the order, please fill the payment details to generate receipt.");
		
		System.out.println("Enter the user name.");
		username = sc.nextLine();
		System.out.println("Your amount is 20000");
		
		System.out.println("Select the payment method below: \n1.Cash\n2.Upi\n3.Credit card");
		option = sc.nextInt();
		if (option == 1) {
			Payment obj = new Payment(username,"Cash",20000);
		}
		else if (option == 2) {
			System.out.println("Enter upi id: ");
			upi = sc.nextLong();
			Payment obj = new Payment(username,"Cash",20000,upi);
		}
		else if (option == 3) {
			System.out.println("Enter card number: ");
			cardno = sc.next();
			System.out.println();
			Payment obj = new Payment(username,"Cash",20000,cardno);
		}
		else {
			System.out.println("Invalid input.");
		}
	}
}

