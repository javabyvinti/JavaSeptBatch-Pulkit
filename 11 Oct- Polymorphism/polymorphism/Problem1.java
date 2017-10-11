package com.bmpl.polymorphism;

class A{
	
	void show(){
		System.out.println("show of A");
		//return "Parent";
	}
}

class B extends A{
	
	void show(){
		System.out.println("show of B");
		//return "hello";
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show(9);

	}

}
