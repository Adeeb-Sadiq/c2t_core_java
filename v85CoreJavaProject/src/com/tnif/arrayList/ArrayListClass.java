package com.tnif.arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("program on array list");
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		// to add numbers
		System.out.println("Enter the no of elements to enter: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		
		System.out.println(arr);
		
		// to delete numbers
		
		System.out.println("Removing the value at index 1");
		arr.remove(1);
		System.out.println(arr);
		// to modify numbers
		
		System.out.println("changing the first value ");
		arr.set(0, 99);
		
		System.out.println(arr);
		
		

		// using get method
		
		System.out.println("usign get method for printing the values of array list");
		
		for(int i = 0; i< arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
		
		
		
	}
}
