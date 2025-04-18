package com.Chapter11MultiThreadedProgramming.Programs;
//Using Join to wait for threads to finish.

class NewThread2 implements Runnable
{
	String name; //name of the thread
	Thread t;
	
	NewThread2(String threadname2)
	{
		name = threadname2;
		t = new Thread(this , name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	//This is the entry point for thread.
	public void run()
	{
		try
		{
			for(int i = 5 ; i > 0 ; i--)
			{
				System.out.println(name  + i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println(name + " interrupted.");
			}
			System.out.println(name + " existing.");
		}
	}
	

public class DemoJoin {
	public static void main(String[] args) {
		NewThread2 ob1 = new NewThread2("one");
		NewThread2 ob2 = new NewThread2("Two");
		NewThread2 ob3 = new NewThread2("Three");
		
		System.out.println("Thread One is alive: " + ob1.t.isAlive());
		System.out.println("Thread Two is alive: " + ob2.t.isAlive());
		System.out.println("Thread Three is alive: " + ob3.t.isAlive());
		//Wait for threads to finish
		try
		{
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interrupted.");
		}
		
		System.out.println("Thread one is alive: " + ob1.t.isAlive());
		System.out.println("Thread two is alive: " + ob2.t.isAlive());
		System.out.println("Thread three is alive: " + ob3.t.isAlive());
		
		System.out.println("Main Thread Exiting.");
	}
}
