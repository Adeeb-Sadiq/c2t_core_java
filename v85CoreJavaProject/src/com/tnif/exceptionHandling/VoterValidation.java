package com.tnif.exceptionHandling;

import java.util.Scanner;

public class VoterValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "SomeName";
		int age = 11;
		
//		System.out.println("Enter your full name: ");
//		name = sc.nextLine();
		
//		System.out.println("Enter your age: ");
//		age = sc.nextInt();
		
		
		try {
			checkage(name, age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void checkage(String name, int age) throws Exception {
		if(age < 18) {
			throw new Exception("age under 18");
		}
		System.out.println(name+ " "+ age);
	}
}
