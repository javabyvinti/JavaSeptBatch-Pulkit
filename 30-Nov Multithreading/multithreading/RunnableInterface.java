package com.bmpl.multithreading;

public class RunnableInterface implements Runnable{

	public static void main(String[] args) {
		
		RunnableInterface obj = new RunnableInterface();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		t1.setName("First Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t2.setName("Second Thread");
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.start();
		t3.setName("Third Thread");
		t3.setPriority(Thread.MAX_PRIORITY);
		
		//Default priority or Norm_prority = 5
		// Prioriyt between 1- 10
	}

	@Override
	public void run() {
		System.out.println("Thread is running..." + Thread.currentThread().getName() +
				" Thread Priority is = " + Thread.currentThread().getPriority());
		
	}
}
