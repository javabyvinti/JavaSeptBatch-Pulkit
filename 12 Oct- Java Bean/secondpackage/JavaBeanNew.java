package com.bmpl.secondpackage;

import java.util.Scanner;

public class JavaBeanNew {

	//private 
	//JavaBean --> instance variables declare private
	//            setters and getters methods must be public
	
	private int id ;//
	private String name;
	private float percentage;
	private long phn;
	private String address;
	
	
	
	
	
	//access specifier --> default--> inside package 
	
	//input --> output
	
//	public void input(int i, String name)
//	{
//		//this --> current class--> instance variables, methods, cons
//		id = i;
//		this.name = name;
//	}
//	
//	public void output(){
//		System.out.println("Name is=" + name);
//		System.out.println("Id is=" + id);
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//POJO class--> Pure old java object class
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public long getPhn() {
		return phn;
	}





	public void setPhn(long phn) {
		this.phn = phn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
	
		JavaBeanNew obj  = new JavaBeanNew();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		obj.setName(name);
		System.out.println(obj.getName());
		
		
		//next or nextLine()
		
//		System.out.println("Enter your id");
//		int id = scanner.nextInt();
//		if(id<0){
//			System.out.println("Invalid Id");
//		}else{
//			//obj.input(id, name);
//			//obj.output();
//			
//		}

	}

}
