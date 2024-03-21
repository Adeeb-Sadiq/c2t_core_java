package com.adeebsadiq.assignment.utilities;

import com.adeebsadiq.assignment.employees.Employee;

public class EmployeeUtilitie {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Adeeb");
		e.setEmployeeid("E01");
		e.setSalary(50000);
		System.out.println(e);
	}
}
