package com.tnif.threads;

public class ExtendsClass extends Thread{
	private int a;

	public ExtendsClass(int a) {
		this.a = a;
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " object of " + a);
		}
	}
}
