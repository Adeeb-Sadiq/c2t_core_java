package com.adeebsadiq.assignment;

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
		Payment cash = new Payment("Abc","cash",20000);
		Payment upi = new Payment("Xyz","Upi",50000,89765423);
		Payment card = new Payment("Pqr","credit card",120000,"4682 4865 1235");
		
	}
}

