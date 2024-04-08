package com.tnif.exceptionHandling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter 2 numbers to divide.");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a/b;
			System.out.println("the value of c is: "+ c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
