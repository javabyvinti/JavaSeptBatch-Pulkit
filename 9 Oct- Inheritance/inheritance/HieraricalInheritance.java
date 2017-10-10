package com.bmpl.inheritance;

class Bank{
	void withdraw(){
		System.out.println("Withdraw money");
	}
}

class HDFC extends Bank{
	
	void withdrawMoney(){
		withdraw();
	}
	//overidding
	void withdraw(){
		
	}
	
}


class PNB extends Bank{
	
	void withdrawAmount(){
		withdraw();
	}
	
	void withdrawMoney(){
		
	}
	
	
}



public class HieraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
