package com.bmpl.multithreading;

public class Multithreading3 extends Thread{
//synchronized keyword
	
	synchronized void calculate(int value)
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(currentThread().getName() + " " + value * i);
		}
	}
	
	@Override
	public void run() {
		super.run();
		calculate(4);
	}

	public static void main(String[] args) {
		Multithreading3 t1 = new Multithreading3();
		Multithreading3 t2 = new Multithreading3();
		Multithreading3 t3 = new Multithreading3();
	
		t1.start();
		t2.start();
		t3.start();
	}
}