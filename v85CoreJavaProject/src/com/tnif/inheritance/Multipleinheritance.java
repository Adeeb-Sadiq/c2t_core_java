package com.tnif.inheritance;

import com.tnif.inheritance.multiple.*;

public class Multipleinheritance {

	public static void main(String[] args) {
		Car c = new Car("BMW","Bangalore","M340i","xDrive",9200000);
		Bike b = new Bike("BMW","Bangalore","S1000RR",null,2075000);
		
		System.out.println(c);
		System.out.println(b);
	}

}
