package com.bmpl.array;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your values");
		
		int max = 0;
		
		Integer values[] = new Integer[5];
	
		for(int i = 0; i<values.length; i++)
		{
			values[i] = scanner.nextInt();
		}
		
		max = values[0];
		
		for(int i = 1 ; i<values.length; i++){
			
			if(values[i] < max)
			{
				max = values[i];
			}
		}
		System.out.println("Max value = " + max);	
	}
}