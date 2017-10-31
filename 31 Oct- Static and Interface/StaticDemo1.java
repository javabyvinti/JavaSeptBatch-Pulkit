package com.bmpl.javabasic;

// static keyword


public class StaticDemo1 {

	// static loads first into memory
	// no need to create object
	
	static int value = 1;
	
	StaticDemo1(){
		System.out.println("value="+value);
		value++;
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo1 obj1 = new StaticDemo1();
		StaticDemo1 obj2 = new StaticDemo1();
		StaticDemo1 obj3 = new StaticDemo1();
		StaticDemo1 obj4 = new StaticDemo1();

		
		
	}

}
