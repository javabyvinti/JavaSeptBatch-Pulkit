package com.bmpl.string;

public class StringDemo {

	public static void main(String[] args) {
		
		//immutable --> which can never be changed
		
		String a = "Hi";
		String b = new String("Hi");
		
		String userName = "RamKumar";
		
		// endsWith(), startsWith(), replaceAll()
		// trim(), replace(), indexOf()
	
		
		System.out.println(userName.charAt(6));
		
		String data[] = userName.split("m");
		
		System.out.println(data.length);
		
		for(int i = 0; i<= data.length-1; i++)
		{
			System.out.println(data[i]);
		}
		
		//array traverse use --> enhance for loop
		for(String d : data){
			System.out.println(d);
		}
		
		//beginIndex --> >= (Greater than equal to) 
		// endIndex --> < (Less than)
		
		System.out.println(userName.substring(0,5));
		
		userName = userName.concat(b);
		
		userName = userName.toLowerCase();
		System.out.println(userName);
		
		System.out.println(userName.toUpperCase());
		
		System.out.println(userName);
		
		float a1 = 10.00f;
		int b1 = 10;
		
		System.out.println(a1==b1);
		System.out.println(a==b);

		
		
	}

}
