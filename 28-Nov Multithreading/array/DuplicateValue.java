package com.bmpl.array;

import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your values");
		
		int duplicate = 0;
		
		Integer values[] = new Integer[5];
		
		int arraySize = values.length;
		
		for(int i = 0; i< arraySize; i++)
		{
			values[i] = scanner.nextInt();
		}

		duplicate = values[0];
		
		for(int i = 0; i < arraySize; i++)
		{
			for(int j = i+1; j < arraySize; j++)
			{
				if(values[i].equals(values[j]))
				{
					while(j < arraySize - 1){
						values[j] = values[j + 1];
						j++;
				}
				arraySize--;	
//					System.out.println("Duplicate value Found at = values[" +
//				i + "] and values[" + j + "] = " + values[i]);

				}
			}
		}
		
		for(int i = 0; i< arraySize; i++){
			System.out.println(values[i]);
		}
		//System.out.println("Duplicate value is = " + duplicate);
		
	}

}
