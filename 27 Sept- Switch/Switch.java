package javaseptbatch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		//decision making
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your character");
		
		char userValue = scanner.next().charAt(0);
	
		
//		if(userValue == 'a' || userValue == 'e' || userValue == 'i'
//				|| userValue== 'o' || userValue == 'u'){
//			
//			System.out.println("Vowel");
//		} else{
//			System.out.println("Consonant");
//		}
		
		switch(userValue){
		//char, 
		//String evaluation is possible with switch in java
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonant");
		break;
			
		}
		
	}

}




