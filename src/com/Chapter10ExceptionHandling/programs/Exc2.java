package com.Chapter10ExceptionHandling.programs;

public class Exc2 {
	public static void main(String[] args) {
		int d ,a ;
		
		try 
			{//monitor a block of code.
			d = 0;
			a = 42/d;
			System.out.println("This will not be Pronted.");
			}
		
		catch(ArithmeticException e)
		{	//Catch divide-by-zero error
			System.out.println("Division By Zero.");
		}
		System.out.println("After catch statement.");
	}
}
