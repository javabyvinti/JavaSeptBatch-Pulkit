package com.bmpl.array;

import java.util.Scanner;

public class Array {

	//Array --> collection of elements
	// by default --> 0 index
	
	
	public static void main(String[] args) {
	
		Integer value[] = new Integer[5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your values");
		
		for(int i = 0; i< value.length; i++){
			value[i] = scanner.nextInt();
		}
		
		System.out.println("Values are");
		
		for(int i = 0; i<value.length; i++){
			System.out.println("value[" + i + "] = " + value[i]);
		}

	}

}
