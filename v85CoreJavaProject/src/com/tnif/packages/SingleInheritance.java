package com.tnif.packages;

import java.util.Scanner;

public class SingleInheritance extends Student{
	public String branch;
	
	public SingleInheritance() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter branch");
		this.branch = sc.next();
	}
	
	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		
	}	
	
}
