package com.Chapter11MultiThreadedProgramming.Programs;
//Create multiple threads.

class NewThread1 implements Runnable
{
	String name; // Name of the thread
	Thread t;
	
	NewThread1(String threadname)
	{
		name = threadname;
		t = new Thread(this , name);
		System.out.println("New thread: " + t);
		t.start(); //Start the thread
	}
	
	//This is the entry point for thread.
	public void run()
	{
		try
		{
			for(int i = 5 ; i > 0 ; i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
public class MultiThreadDemo {
	public static void main(String[] args) {
		new NewThread1("one");
		new NewThread1("two");
		new NewThread1("three");
		
		try
		{
			//Wait for other threads to end
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Main thread exiting.");
	}
}
