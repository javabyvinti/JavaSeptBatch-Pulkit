package com.bmpl.polymorphism;

class Data1{
	
	private int value = 50;
	public final int value2 = 100;
	
	final private void add(){
		System.out.println("Only at this class");
		
	}
	void print(){
		add();
		System.out.println(value + value2);
	}
}

class DataNew extends Data1{
	
	Data1 data = new Data1();
	
	void printData(){
		System.out.println(50 + value2);
		
	}
	
}

public class AccessSpecifier {

	public static void main(String[] args) {
		DataNew obj = new DataNew();
		obj.printData();

	}

}
