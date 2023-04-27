package com.pack.java8;

public class MultiThreadingUsingLambda{ //implements Runnable{
  
	public void method1() {
		Runnable r = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.setName("thrreadd");
		System.out.println(t.getName());
		t.start();

	}

//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
//	}

		public static void main(String[] args) {
			MultiThreadingUsingLambda obj = new MultiThreadingUsingLambda();
			obj.method1();
		}
	}

