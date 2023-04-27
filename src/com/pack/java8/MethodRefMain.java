package com.pack.java8;

public class MethodRefMain {
	public static void main(String[] args) 
	{
		MethodReferencing mr = new MethodReferencing();
		System.out.println("learning method reference");
		//CustomInterface ci = MethodReferencing :: method1; // method referencing of static method
		CustomInterface ci = mr :: method1; // method referencing of non static method
		ci.sayHello();
		
		Runnable obj = MethodReferencing :: ThreadTask;
		Thread t = new Thread(obj);
		t.start();
		
		
	}

}
