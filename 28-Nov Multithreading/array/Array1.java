package com.bmpl.array;

import java.util.Scanner;

// copy one array elements into another
public class Array1 {

	public static void main(String[] args) {
		
		String name[] = new String[5];
		String nameNew[] = new String[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your values");
		
		for(int i = 0; i< name.length; i++)
			name[i] = scanner.next();
		
		for(int i = 0; i<name.length; i++){
			nameNew[i] = name[i];
		}
		System.out.println("Copied elements are");
		for(String n : nameNew){
			System.out.println(n);
		}
		
	}

}
