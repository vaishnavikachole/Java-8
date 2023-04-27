package com.pack.java8;

import java.util.Optional;

public class OptionalClass
{
	public static Optional<String> getName(){
		String name = "Ravina";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		OptionalClass obj = new OptionalClass();
		
		String str="Java is Awesome";
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		 
		System.out.println(optional.orElse("no value in this object"));
		
		Optional<String> Optionalname = OptionalClass.getName();
		System.out.println(Optionalname.orElse("null return"));
		
		
	
	
	
	
	}

	

	
	}