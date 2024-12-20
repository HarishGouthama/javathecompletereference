package com.Chapter11MultiThreadedProgramming.Programs;
//This program is not synchronized.
class Callme
{
	synchronized void call(String msg)
	{
		System.out.println("[" + msg);
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ , String s)
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		target.call(msg);
	}
}

public class Synch {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target , "Hello");
		Caller ob2 = new Caller(target , "Synchronized");
		Caller ob3 = new Caller(target , "World");
		
		//Wait for threads to end.
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}