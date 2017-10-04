package javaseptbatch;

import java.util.Scanner;

public class Sum {

	static int value1, value2, result;
	float data;
	double d;
	long longValue;
	
	
	//int value1 , value2, result;
	
	//static variables
	//Types of variables--> 
	
	//instance variable/global variable and static variable--> have default value
	
	//and local variables--> no default value
	
	static void input(int first, int second){
		int third = 60;
		result = first + second + third;
	}
	
	void ouput(){
		System.out.println("Result is=" + result);
	}
	
	public static void main(String[] args) {
		
		//local --> scope inside the method
		//local variable are not initialized with any default value
		
		int value = 10;
		System.out.println(value);
		
		
		Scanner scanner = new Scanner(System.in);
		Sum obj = new Sum();
		Sum obj1 = new Sum();
		System.out.println("Enter first value");
		
		System.out.println(value1 + obj.value2);
		//no need to create object for static fields
		
		//obj.value1 = scanner.nextInt();
		//obj.value2 = scanner.nextInt();
		
		//obj1.value1 = scanner.nextInt();
		//calling
		
		input(scanner.nextInt(), scanner.nextInt());
		obj.ouput();
		
		obj.data = 43.54f;//double
		System.out.println(obj.data);

		obj.d = 54.76;
		
		obj.longValue = 5443544332l;//long value
		
	}

}
