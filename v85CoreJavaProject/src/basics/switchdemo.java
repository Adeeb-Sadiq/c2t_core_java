package basics;

import java.util.Scanner;

public class switchdemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number from 1 to 3");
		int x = sc.nextInt();
		
		switch(x) {
		case 1 :
			System.out.println("you have entered one"); 
			break;
		case 2:
			System.out.println("you have entered two"); break;
		case 3:
			System.out.println("You have entered three"); break;
		default:
			System.out.println("the number is not in range from 1 to 3"); break;
		}
	}
}
