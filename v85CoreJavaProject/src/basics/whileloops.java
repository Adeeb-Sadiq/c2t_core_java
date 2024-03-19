package basics;

//import java.util.Scanner;

public class whileloops {
	public static void main(String args[]) {
		
		System.out.println("Example for while and do while.");
		System.out.println("while loop:");
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("do while loop:");
		i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
}
