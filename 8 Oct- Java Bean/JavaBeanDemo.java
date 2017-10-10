package javaseptbatch;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaBeanDemo {

	//Java Bean -->1. instance variables must be declared as private
	//          -->2. setters and getters must be declared public
	//private --> access specifier
	
	private String name;
	private int rollno;
	
	public JavaBeanDemo(){
		name = "No Name";
	}
	
//	public void input(String name, int rollno){
//		this.name = name;
//		this.rollno = rollno;
//	}
//	//default --> access within the package
//	public void print(){
//		System.out.println("Name="+name);
//		System.out.println("Rollno="+rollno);
//	}
	
	public String getName() {
		if(name.equals(null)){
			return "Valid name required";
		} else
			return name;		
	}

	public void setName(String name) {
		if(Pattern.matches("[a-z]", name)){
			System.out.println("Matched");
		} else{
			System.out.println("Not matched");
		}
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.next();
		
		System.out.println("Enter your rollno");
		int rollno = scanner.nextInt();
		
		JavaBeanDemo obj = new JavaBeanDemo();
		//obj.input(name, rollno);
		//obj.print();

	}

}