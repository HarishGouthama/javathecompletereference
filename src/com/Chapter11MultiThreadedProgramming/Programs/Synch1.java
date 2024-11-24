package com.Chapter11MultiThreadedProgramming.Programs;
//This program uses a synchronized block.

class Callme
{
	void Call(String msg)
	{
		System.out.println("[" + msg);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted.");
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
	
	//Synchronize calls to call()
	public void run()
	{
		synchronized (target) {
			target.Call(msg);
		}
	}
}

public class Synch1 {
	public static void main(String[] args) {
		
		Callme target = new Callme();
		Caller ob1 = new Caller(target , "Hello");
		Caller ob2 = new Caller(target , "Synchronized");
		Caller ob3 = new Caller(target , "World");
		
		//wait for threads to end
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrrupted");
		}
	}
}
