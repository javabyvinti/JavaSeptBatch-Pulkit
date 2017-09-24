package javaseptbatch;

public class Datatypes {

	public static void main(String[] args) {
	

		
		/*//primitive type
		byte data = (byte)129;
		System.out.println(data);
		
		//reference type
		int Value = 1; 
		Integer value = new Integer(1);//object reference
		
		//Datatypes obj = new Datatypes();
*/
		
		//primitive type 
		//int value1 = 50;
		//int value2 = 50;
		
		//reference type

		
		Integer value1 = new Integer(50);
		Integer value2 = new Integer(50);
		int value3 = value2;
		
		String data1 = new String("Hello");
		String data2 = new String("hello");
		
		
		//comparision operator
		// type--> primitive --> value compare --> result show
		//type--> reference--> address compare --> result show
		
		//System.out.println(value1 == value2);
		
		//System.out.println(value1.equals(value2));
		System.out.println(data1.equalsIgnoreCase(data2));
	
/*		int value1 = 54;
		int value2 = 64;*/
	
	}

}