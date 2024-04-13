package com.tnif.threads;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			ExtendsClass a = new ExtendsClass(i);
			a.start();
		}

	}

}
