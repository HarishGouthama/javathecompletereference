package com.Chapter10ExceptionHandling.programs;

//This program contains an error and will not compile.

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside Throw one.");
		throw new IllegalAccessException("DEMO");
	}
	public static void main(String[] args)  {
		try
		{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught " + e);
		}
	}
}
