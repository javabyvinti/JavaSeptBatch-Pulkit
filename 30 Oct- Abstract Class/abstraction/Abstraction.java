package com.bmpl.abstraction;

//abstraction --> 
// abstract keyword --> method and class

//abstract class may or may not contain any abstract method

abstract class Bank{
	
	void withdraw(){
		System.out.println("withdraw amount");
	}
	void deposit(){
		System.out.println("deposit amount");
	}
	void checkBalance(){
		System.out.println("check amount");
	}
	// abstract method inside a class --> 
	//
	
	abstract void rateOfInterest();
	
}


class HDFC extends Bank{
	
	@Override
	void rateOfInterest() {
		System.out.println("rate of interest 8%");
		
	}
	
}

abstract class ICICI extends Bank{
	
	abstract void data();
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		//Bank bank = new Bank();
		

	}

}
