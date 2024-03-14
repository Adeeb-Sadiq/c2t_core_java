package basics;

import java.util.Scanner;

public class ifElseif {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		else if (age == 17) {
			System.out.println("Not eligible, come back next year.");
		}
		else {
			System.out.println("You are not eligible to vote yet.");
		}
	}

}
