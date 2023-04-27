package com.pack.java8;

public class MethodReferencing {
	
	public void method1()
	{
		System.out.println("I am doing task");
	}
	
	public static void ThreadTask() {
		for(int i=1;i<=10;i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
