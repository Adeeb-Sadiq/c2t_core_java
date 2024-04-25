package com.tnif.collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<>();
		s1.add(20);
		s1.add(88);
		s1.add(5);
		s1.add(23);
		s1.add(11);
		s1.add(11);
		s1.add(11);
		System.out.println(s1);
		
		HashSet<Integer> s2 = new HashSet<>();
		s2.add(88);
		s2.add(5);
		s2.add(33);
//		s2.addAll(s1);
		System.out.println(s2);
		

		s1.retainAll(s2);
		System.out.println(s1);
	}
}
