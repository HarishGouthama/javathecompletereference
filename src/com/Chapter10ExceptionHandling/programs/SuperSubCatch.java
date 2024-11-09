package com.Chapter10ExceptionHandling.programs;
/*This Program contains an error.
 * 
 * A SubClass must come before its superclass in
 * a series of catch statements. If not,
 * unreachable code will be created and a 
 * compile-time error will result.
 * */

public class SuperSubCatch {
	public static void main(String[] args) {
		
		try
		{
			int a = 0 ;
			int b = 42 / a;
		}
		
		/* This catch is never reached because
		 * ArthimeticException is a subclass of Exception. */
		catch(ArithmeticException e)
		{//Error - unreachable
			System.out.println("This is never reached.");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception catch.");
		}
	}
}
