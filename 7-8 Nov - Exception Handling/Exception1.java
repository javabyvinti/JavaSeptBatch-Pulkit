package com.bmpl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first value");
		
		
		try{
		
		int first = scanner.nextInt();
		
		System.out.println("Enter your second value");
		
		int second = scanner.nextInt();
		
//		String data = "Data";
//		
//		int newData = Integer.parseInt(data);
//		
		
		int result  = first / second;
		
		System.out.println(result);

		}
		
		catch(InputMismatchException e){
			System.out.println("Only numbers are allowed " + e);
			//e.printStackTrace();
		} catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");	
			e.printStackTrace();
		} catch(NumberFormatException e){
			System.out.println("Number format exception");
		}
		catch(Exception e){
			System.out.println("Some exception occured " + e);
		}
		finally{
			
			// object or database or file -->
			//
			scanner.close();
			System.out.println("Finally executed");
		}
				
	}

}
