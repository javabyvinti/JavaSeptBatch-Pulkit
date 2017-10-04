package javaseptbatch;

public class ClassDemo{

	//state
	//instance variable
	//create a class level and outside any method or constructor
	int value;//default value
	String name;
	float data;
	byte b;
	short s;
	long l;
	double d;
	char ch = 'a';//vary system to system
	
	//behaviour
	void display(){
		System.out.println("Value is = "+ value);
		System.out.println("Name is = " +name);
	}
	
	
	
	public static void main(String[] args) {
	
		ClassDemo obj = new ClassDemo();
		
		System.out.println(obj.name);
		
		System.out.println(obj.value);
		
		System.out.println(obj.data);
	
		System.out.println(obj.ch);
	}

}
