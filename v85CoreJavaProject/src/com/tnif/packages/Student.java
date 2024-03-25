package com.tnif.packages;

import java.util.Scanner;

public class Student {
	private String studentUSN;
	private String studentName;
	private long studentPhno;
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		this.studentName = sc.nextLine();
		System.out.println("Enter Usn");
		this.studentUSN = sc.next();
	}
	
//	public Student(String studentUSN, String studentName, long studentPhno) {
//		this.studentUSN = studentUSN;
//		this.studentName = studentName;
//		this.studentPhno = studentPhno;
//	}

	public String getStudentUSN() {
		return studentUSN;
	}

	@Override
	public String toString() {
		return "Student [studentUSN=" + studentUSN + ", studentName=" + studentName + ", studentPhno=" + studentPhno
				+ "]";
	}

	public void setStudentUSN(String studentUSN) {
		this.studentUSN = studentUSN;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentPhno() {
		return studentPhno;
	}

	public void setStudentPhno(long studentPhno) {
		this.studentPhno = studentPhno;
	}
}
