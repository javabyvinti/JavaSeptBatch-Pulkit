package javaseptbatch;

import java.util.Scanner;

public class ConsDemo3 {
	
	//this-->always refer current class and current class constructor, instance variables and methods
	//this() --> call default cons
	//this(param) --> call parameterized cons
	//this --> this must be first statement in code or where it is called
	
	
	String nameOfStudent;
	int rollno;
	String collegeName;
	short marks;
	float percentage;
	
	ConsDemo3(){
		collegeName = "BMPL";
	}
	
	ConsDemo3(String name, int rn){
		this(); //control transfer to default cons --> constructor chaining
		this.nameOfStudent = name;
		rollno = rn;
	}
	
	ConsDemo3(short marks, float percentage){
		//when name of instance variable and local variable is same
		this();
		this.marks = marks;
		this.percentage = percentage;
	}
	
	public ConsDemo3(String name, int rollno, short marks, float percentage) {
		this();
		nameOfStudent = name;
		this.rollno = rollno;
		this.marks = marks;
		this.percentage = percentage;
		
	}

	void output(){
		System.out.println("Name =" +nameOfStudent);
		System.out.println("Rollno =" +rollno);
		System.out.println("College Name ="+collegeName);
		System.out.println("Marks = " + marks);
		System.out.println("Percentage = "+percentage);
	}
	
	
	
	//Default cons use --> 
	//when we have to initialize instance variable with default value then use default cons 
	
	//parameterized cons use
	//assign value which can be changed acc. to different users then use param cons.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.next();
		
		System.out.println("Enter your rollno");
		int rollno = scanner.nextInt();
		
		System.out.println("Enter your marks");
		short marks = scanner.nextShort();
		
		System.out.println("Enter your percentage");
		float percentage = scanner.nextFloat();
		
		ConsDemo3 ram = new ConsDemo3(name, rollno, marks, percentage); 
		//ram.nameOfStudent = name;
		//ram.rollno = rollno;
		ram.output();

	}

}
