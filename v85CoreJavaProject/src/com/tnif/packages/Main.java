package com.tnif.packages;

import basics.carclass;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.display();
		
		carclass obj = new carclass("bmw","m5","black",600,250000);
		obj.displayBrand();

	}

}
