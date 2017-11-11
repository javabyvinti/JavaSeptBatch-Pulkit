package com.bmpl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAndThrows {

	int value1, value2, result;
	
	void input() throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first value");
				
		value1 = scanner.nextInt();
		
		System.out.println("Enter your second value");
		value2 = scanner.nextInt();

	}
	
	void calculate() throws Exception{
		input();
		
		//		try{
//		
//		}catch(InputMismatchException e){
//			System.out.println("Only no.s are allowed");
//		}
		result = value1 + value2;
		//throw 
	}
	
	void print() throws InputMismatchException{
		calculate();
		System.out.println("Result is = " +result);
	}
	
	
	public static void main(String[] args) throws InputMismatchException{

		ThrowAndThrows obj = new ThrowAndThrows();
		//obj.input();
		//obj.calculate();
		
		try{
			obj.print();
				
		}catch(InputMismatchException e){
			System.out.println();
		}
		catch(Exception e){
		System.out.println("Exception Occured " + e);
		e.printStackTrace();
		}
		
	}

}
