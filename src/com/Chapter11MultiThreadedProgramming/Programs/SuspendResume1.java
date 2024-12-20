package com.Chapter11MultiThreadedProgramming.Programs;
//Suspending and resuming a thread the modern way.

class NewThread implements Runnable
{
	String name;
	Thread t;
	boolean suspendFlag;
	
	NewThread(String threadname)
	{
		name = threadname;
		t = new Thread(this , name);
		System.out.println("New thread: " + t);
		suspendFlag = false;
		t.start();
	}
	
	//THis is the entry point for thread.
	public void run()
	{
		try
		{
			for(int i = 15 ; i > 0 ; i--)
			{
				System.out.println(name + " : " + i);
				Thread.sleep(200);
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " exiting.");
	}
	
	void mysuspend()
	{
		suspendFlag = true;
	}
	
	synchronized void myresume()
	{
		suspendFlag = false;
		notify();
	}
}

public class SuspendResume1 {
	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		
		try
		{
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending Thread one.");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread one");
			ob2.mysuspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming thread two.");
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		
		try
		{
			System.out.println("Waiting for threads to finisnh.");
			ob1.t.join();
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
		System.out.println("Main THread exiting.");
	}
}
