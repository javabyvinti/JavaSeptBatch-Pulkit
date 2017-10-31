package com.bmpl.abstraction;

//class contains if any abstract method 
//then we need to declare the class as abstract
//we cannot create an object of abstract class

//abstract class may or may not contain any abstract method

abstract class Shape{

	Shape(){
		
	}
	
	void playSound(){
		System.out.println("Play sound");
	}
	
	//abstract --> keyword ->used to denote body-less method
	abstract void rotate();	//body-less method
}

abstract class Circle extends Shape{

	void circleData(){
		System.out.println("Circle data");
	}
}

class CircleChild extends Circle{

	@Override
	void rotate() {
		
	}
	
}

class Triangle{
	
}

class Rectangle{
	
}

public class AbstractClass {

	public static void main(String[] args) {
	
		Circle obj = new CircleChild();	//upcasting
		obj.rotate();
		obj.playSound();
	}
}