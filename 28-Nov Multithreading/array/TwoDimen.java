package com.bmpl.array;

import java.util.Scanner;

public class TwoDimen {

	public static void main(String[] args) {
		
		//2d array --> row and column // name rollno
		//	 name    rollno
		//	 ram       1
		// 	 rohit	   2
		//matix 
		// 
		
		int array[] = {54, 76, 32, 76};
		
		int matrix[][] = { {1, 2}, {3, 4}, {5, 6}, {54, 87}, {43, 87}};// 3 by 2 =  6 elements
		
		Integer matrix2[][] = new Integer[2][3];
		
		System.out.println("Array length = " + array.length);
		
		System.out.println("Matrix length = " + matrix2.length);

		System.out.println("Enter 4 elements");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int row = 0; row < 2; row++){ // row = 2<2
			
			for(int column = 0; column <3; column++){ // col = 2<2
				
				matrix2[row][column] = scanner.nextInt();//[1][1] = 54
			}
		}
		//int colCount = 0, rowCount = 0;
		
		
		for(int row = 0; row<2; row++)
		{
			
			for(int column = 0; column < 3; column++){ // col = 2<2
				
				System.out.print(matrix2[row][column] + "\t");
				
			}
			//colCount++;
			System.out.println();
			//rowCount++;
		}
		
		//System.out.println("Column= " + colCount);
		//System.out.println("Row= " + rowCount);
	}
}
