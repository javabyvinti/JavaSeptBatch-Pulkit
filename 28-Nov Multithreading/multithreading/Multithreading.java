package com.bmpl.multithreading;

public class Multithreading extends Thread{

	@Override
	public void run() {
		super.run();	// Thread class--> to move thread from runnable state to running state
		System.out.println("Thread is running... " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Multithreading t1 = new Multithreading();
		Multithreading t2 = new Multithreading();
		Multithreading t3 = new Multithreading();
		
		//t1.start(); // by default name starts with Thread-0
		t2.start();
		t2.setPriority(MAX_PRIORITY);
		t3.start();
		//obj.run();	// you are calling object --> call will redirect to the main() --> "main" thread
	}
}
