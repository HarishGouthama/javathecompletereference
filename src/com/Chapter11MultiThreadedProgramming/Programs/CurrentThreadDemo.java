package com.Chapter11MultiThreadedProgramming.Programs;
//Controlling the main Thread.

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Current thread: " + t);
		
		//Change the name the thread
		t.setName("My Thread");
		
		System.out.println("After name change: " + t);
		
		try
		{
			for(int n = 5000 ; n > 0 ; n--) {
				System.out.println(n);
				Thread.sleep(1);
			}
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}