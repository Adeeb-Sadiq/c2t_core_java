package com.tnif.lambdaExpression;


interface Lambda {
	public void demo();
}

public class Main {

	public static void main(String[] args) {
		new Thread ( () -> {System.out.println("hello world");}).start();
		
		Lambda obj = () -> {
			System.out.println("this is demo method.");
		};
		
		obj.demo();
	}

}
