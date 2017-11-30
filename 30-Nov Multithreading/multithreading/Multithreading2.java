package com.bmpl.multithreading;

public class Multithreading2 extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i = 1; i<=5; i++){
			try {
				System.out.println(currentThread().getName() + " " + i);
				if(Thread.currentThread().getName().equals("First Thread")){
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Multithreading2 thread1 = new Multithreading2();
		Multithreading2 thread2 = new Multithreading2();
		Multithreading2 thread3 = new Multithreading2();
		
		thread1.start();
		thread1.setName("First Thread");
		thread2.start();
		thread2.setName("Second Thread");
		thread3.run();
		
	}//start--> run--> complete or blocked
}
