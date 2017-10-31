package com.bmpl.abstraction;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int fix_age = 20;
	
		int age = scanner.nextInt();
		
		if(age>=fix_age){
			System.out.println("can vote");
			//fix_age++;
		}
		
		//fix_age = 22;
		
	}

}
