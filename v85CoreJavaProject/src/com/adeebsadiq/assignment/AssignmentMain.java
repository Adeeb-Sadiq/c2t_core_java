package com.adeebsadiq.assignment;

import com.adeebsadiq.assignment.employees.*;

public class AssignmentMain {

	public static void main(String[] args) {
		Developer d = new Developer();
		Manager m = new Manager();
		d.setName("Dev");
		m.setName("Mike");
		System.out.println(d.getName());
		System.out.println(m.getName());
	}

}
