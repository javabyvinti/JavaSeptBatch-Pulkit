package com.bmpl.polymorphism;

public class Add {

	
	void sum(){
		int firstValue = 100;
		int secondValue = 200;
		System.out.println(firstValue + secondValue);
	}
	
	void sum(int firstValue, int secondValue){
		System.out.println(firstValue + secondValue);
	}
	
	long sum(long firstValue, long secondValue)
	{
		return firstValue + secondValue;
	}
	
	float sum(float firstValue , float secondValue)
	{
		return firstValue + secondValue;
	}
	
	public static void main(String[] args) {
		
		Add add = new Add();	
		add.sum(50, 50);
		
		System.out.println(add.sum(5000000054l, 4332435443l));
		float result = add.sum(60.60f, 60.54f);
		System.out.println(result);

	}

}
