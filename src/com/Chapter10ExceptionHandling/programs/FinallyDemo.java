package com.Chapter10ExceptionHandling.programs;
//Demonstrate finally.

public class FinallyDemo {
	//Through an exception out of the method.
	static void procA()
	{
		try
		{
			System.out.println("Inside procA");
			throw new RuntimeException("Demo");
		}
		finally
		{
			System.out.println("ProcA's finally");
		}
	}
	
	//Return from within a try block.
	static void procB()
	{
		try
		{
			System.out.println("Inside procB");
			return;
		}
		finally
		{
			System.out.println("procB's finally");
		}
	}
	
	//Execute a try block normally.
	static void procC()
	{
		try
		{
			System.out.println("Inside procC");
		}
		
		finally
		{
			System.out.println("procC's finally");
		}
	}
	
	public static void main(String[] args) {
		try
		{
			procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}