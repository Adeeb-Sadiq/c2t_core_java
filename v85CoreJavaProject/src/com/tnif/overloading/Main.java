package com.tnif.overloading;

public class Main {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int a = mo.sum(20, 30);
		int b = mo.sum(1, 1, 1);
		
		System.out.println("Example for method overloading.");
		System.out.println(a + " " + b);
		
		System.out.println("Example for constructor overloading.");
		ConstructorOverloading x = new ConstructorOverloading();
		ConstructorOverloading y = new ConstructorOverloading("obj");
	}
}
