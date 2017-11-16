package com.bmpl.filehandling;

import java.util.Scanner;

public class RegistrationForm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose any one option:");
		System.out.println("Press 1 for Registration");
		System.out.println("Press 2 for Login");
		
		byte userChoice = scanner.nextByte();
		
		System.out.println("Enter your name");
		scanner.nextLine();
		String name = scanner.nextLine();//wait for \n
		
		System.out.println("Enter your password");
		String password = scanner.next();
		
		if(userChoice==1){
			UserRegistration userRegistration = new UserRegistration();
			userRegistration.storeUserDetails(name, password);
		} else {
			UserAuthentication userAuthentication = new UserAuthentication();
			userAuthentication.readUserDetails(name, password);
		}
		
	}

}
