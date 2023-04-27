package com.pack.java8;

public class LambdaExpression //implements CustomFunctionalInterface
{

//	@Override
//	public void sayHello() {
//		System.out.println("hiii");
//		
//	}
	public void method1() {
        System.out.println("method1 called");
		CustomFunctionalInterface i = () -> System.out.println("Hello");
		i.sayHello();
    	  
   
	}
//	
      public static void main(String[] args) {
//		CustomFunctionalInterface obj = new CustomFunctionalInterface(){ 
//			public void sayHello() {   //annonymous class
//				System.out.println("hiii");
//			}
//		};
//		
		//obj.sayHello(); //method calling
    	  
    	 // CustomFunctionalInterface i = () -> System.out.println("Hello");
    	  
    	  //i.sayHello();
   

//  		};
 
      	  LambdaExpression obj = new LambdaExpression();
      	  obj.method1();

	}

	

	
}
