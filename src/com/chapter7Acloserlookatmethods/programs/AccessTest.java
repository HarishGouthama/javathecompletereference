package com.chapter7Acloserlookatmethods.programs;

/*
 * This Program demonstrates the difference between 
 * public and private.
 */

class Test7
{
	int a; // Default access
	public int b; // Public Access
	private int c; // Private Access
	
	// Methods to access c
	void setc(int i)
	{
		c = i;
	}
	int getc()
	{
		return c;
	}
}

public class AccessTest {
	public static void main(String[] args) {
		
		Test7 ob = new Test7();
		
		//These are OK ,  a and b may be accessed directly.
		
		ob.a = 10;
		ob.b = 20;
		
		//This os not OK and will cause error.
		
		//ob.c = 100;
		
		// You must access c through its methods.
		
		ob.setc(200);
		
		System.out.println("a , b and c: " + ob.a + " " + ob.b + " " + ob.getc());
		
	}
}
