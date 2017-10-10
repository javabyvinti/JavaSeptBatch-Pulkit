package com.bmpl.inheritance;

//inheritance
class GrandParent{
	
}


class Parent {
	
	
	/*private*/ 
	int value = 65;
	
	Parent(){
		System.out.println("Default cons of parent class");
	}
	Parent(int data){
		System.out.println("Param cons of Parent" + data);
	}
	
	
	void data(){
		System.out.println("Data of Parent");
	}
}

class Child extends Parent{

	int value = 10;
	
	Child(){
		super(7);//overload constructor
		//this(6);
		System.out.println("Default Cons of child class");
	}
	
	Child(int value){
		System.out.println("Param cons of Child class" + value);
	}
	//super keyword--> always point to parent--> cons, method or variable
	//this keyword--> current class
	
	void data(){
		System.out.println("Data of child");
//		super.data();
//		super.value = 90; //
	}
	
	void calculate(int value){
		value = value +  this.value  + super.value; 
		System.out.println("Value is="+value);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		//upcasting and downcasting
		
		// inheritance
		Parent obj = new Child();//upcasting implicit
		obj.data();
		System.out.println(obj.value);
	}

}
