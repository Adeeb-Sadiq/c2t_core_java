package com.tnif.packages;

import basics.carclass;

public class Main {

	public static void main(String[] args) {
		carclass obj = new carclass("bmw","m5","black",600,250000);
		obj.displayBrand();
		
		Student s = new Student();
		s.setStudentName("zoro");
		
		System.out.println(s);
	}

}
