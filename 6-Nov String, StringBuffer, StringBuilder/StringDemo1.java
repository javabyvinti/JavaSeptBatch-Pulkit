package com.bmpl.string;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String value = "HelloJava";
										// starting index
		System.out.println(value.substring(2, 6));
		
		
		System.out.println(value.concat("Again"));
		
		String h = "Hello";
		String h1 = "hllo";
		
		System.out.println(h.equalsIgnoreCase(h1));
		
		System.out.println(value.charAt(4));
		
		System.out.println(value);
		
		//starting index => >=
		//ending index => 	<
		
		// split --> 

		
		String data = "This is my string data";
		
		String newData[] = data.split("s");
		
//		for(int i = 0; i<= newData.length - 1; i++)
//		{
//			System.out.println(newData[i]);
//		}
		
		
		for(String s : newData){
			System.out.print(s);
		}
		
		
		String hello = "hello";
		hello = "Hello";
		
		//StringBuffer sb = "h";
		
		
	}

}
