package basics;

import java.util.Scanner;

public class forLoop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to get it's table:");
		
		int num = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
}
