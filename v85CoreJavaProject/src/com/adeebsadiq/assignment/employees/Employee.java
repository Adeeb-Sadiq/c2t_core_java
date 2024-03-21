package com.adeebsadiq.assignment.employees;

public class Employee {
		private String name;
		private String employeeid;
		private float salary;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(String employeeid) {
			this.employeeid = employeeid;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", employeeid=" + employeeid + ", salary=" + salary + "]";
		}
		
		
}
