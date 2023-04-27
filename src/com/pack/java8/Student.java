package com.pack.java8;

public class Student 
{
	private int studentRollNo;
	private String studentName;
	
	public Student() {
		System.out.println("student constructor called");
	}
	public Student(int studentRollNo, String studentName) {
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
	}
	public void getInfo() {
		System.out.println("get info method called");
	}

}
