package com.adeebsadiq.assignment;

public class Circle {
	private float radius;
	private String colour;
	
	public Circle() {
		System.out.println("A object for the class circle is created.");
	}
	
	public void getinput(float r, String c) {
		this.radius = r;
		this.colour = c;
		System.out.println("Radius: "+r+" " + "Colour: " + c );
	}
	
	public void calcArea() {
		float a = (float) (3.14 * this.radius * this.radius);
		System.out.println("The area of the circle is : " + a);
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.getinput(5, "Red");
		obj.calcArea();
	}
}
