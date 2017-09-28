package javaseptbatch;

import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		
		//command line arguments
		//wrapper classes--> 
		//primitive datatypes--> int, float, double, long, etc
		//reference datatypes--> Integer, Float, Double, Long, String, etc
		
		//char data = args[1];
		
		//String name = args[0];//For string type 
//		int value1 = Integer.parseInt(args[0]);// 10
//		int value2 = Integer.parseInt(args[1]);
		
		//Using Scanner class
		
		
/*		int value1 = 10;
		int value2 = 20;*/
		
		System.out.println("Enter your first value");
		
		Scanner obj = new Scanner(System.in);  
		
		int value1 = obj.nextInt();
		
		final int VALUE3 = 50;
		
		
		System.out.println("Enter your Second value");

		int value2 = obj.nextInt();
		
		value1 = value1 + value2;//10 + 20 = value1 = 30
		value2 = value1 - value2;//30 - 20 = value2 =  10
		value1 = value1 - value2;//30 - 10 = value1 = 20
		
		System.out.println("Value1 = "+value1);
		System.out.println("Value2 = "+value2);
		//value1 = 20
		//value2 = 10
		
		obj.close();

		//value1 = value1 + VALUE3;
		
	}

}
