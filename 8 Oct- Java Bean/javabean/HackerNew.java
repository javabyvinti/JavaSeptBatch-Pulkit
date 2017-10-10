package com.bmpl.javabean;

import java.util.Scanner;

import javaseptbatch.JavaBeanDemo;

public class HackerNew {

	public static void main(String[] args) {
		JavaBeanDemo obj = new JavaBeanDemo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		
		obj.setName(scanner.next());
		System.out.println(obj.getName());
		
		//obj.input("Ram", 5);
		//obj.print();
		//obj.input(1);
		//obj.input("");
		
		

	}

}
