package com.chapter8Inheritance.programs;

/* In a class hierarchy, private members remain
 * private to their class.
 * 
 * This program contains an error and will not compile.
 */

//Create a superclass.
class AA
{
	int i; // public by default.
//	private int j; // private to A.
	
	void setij(int x , int y)
	{
		i = x;
	//	j = y;
	}
}

// A's j is not accessible here.
class BB extends AA
{
	int total;
	void sum()
	{
	//	total = i + j;
	}
}

public class Access {
	public static void main(String[] args) {
		B subOb = new B();
		
		subOb.sum();
	//	System.out.println("Total is " + subOb.total);
	}
}
