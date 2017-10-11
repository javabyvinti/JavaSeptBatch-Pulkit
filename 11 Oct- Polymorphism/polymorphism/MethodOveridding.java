package com.bmpl.polymorphism;


class Shape{
	
	/*protected*/ void areaCalculate(int length, int width){
		System.out.println("Length = " +length);
		System.out.println("Width = "+ width);
		//System.out.println("Basic shape" + (length * width));
	}
}

class Rectangle extends Shape{

	@Override
	public void areaCalculate(int length, int width) 
	{
		super.areaCalculate(length, width);
		System.out.println("Area of Rectangle=" +length * width);
	}
	
	
}

class Triangle extends Shape{

	//annotations --> java --> for developers
	@Override 
	void areaCalculate(int length, int width) 
	{
		System.out.println("Area of Triangle=" + (length * width)/2);
	}

	
}


public class MethodOveridding {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.areaCalculate(60, 80);

		Rectangle rectangle = new Rectangle();
		rectangle.areaCalculate(60, 30);
		
	}

}
