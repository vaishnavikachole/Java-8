package com.pack.java8;

public class CustructorRefMain {
	
	public static void main(String[] args)
	{	
		customInterface1 ci = Student::new;
		
		Student stud = ci.getData();
		
		stud.getInfo();
	}

}
