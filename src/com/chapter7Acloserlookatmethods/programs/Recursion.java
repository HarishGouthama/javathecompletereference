package com.chapter7Acloserlookatmethods.programs;

//A Simple example of recursion.

class Factorial
{
	//This is a recursive method.
	
	int fact(int n)
	{
		int result;
		
		if(n == 1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}

public class Recursion {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 3 is " + f.fact(3));
		System.out.println("Factorial of 3 is " + f.fact(4));
		System.out.println("Factorial of 3 is " + f.fact(5));
		System.out.println("Factorial of 3 is " + f.fact(6));
		System.out.println("Factorial of 3 is " + f.fact(7));		
	}
}
