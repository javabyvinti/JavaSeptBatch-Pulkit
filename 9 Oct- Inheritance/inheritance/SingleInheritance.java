package com.bmpl.inheritance;

class Person{
	
	String personName;
	long personPhn;
	float data;
	
	Person(){
		data = 54.87F;
		personName = "Ram";
		personPhn = 76587544332L;
	}
	
	void input(){
		System.out.println("Input method of Person class");
	}
}

class Student extends Person{
	
	String studName;
	int studRollno;
	
	Student(){
		personName = "Ram kumar";
		studName = "Rohan";
		studRollno = 4;
	}
	
	void output(){
		//input();
		System.out.println("output of Student class");
	}
}

class Employee extends Student{
	
	void empData(){
		output();
		input();
	}
	
}



public class SingleInheritance {

	
	public static void main(String[] args) {
		
		Student ram = new Student();
		ram.output();
		System.out.println(ram.studName);
	}

}
