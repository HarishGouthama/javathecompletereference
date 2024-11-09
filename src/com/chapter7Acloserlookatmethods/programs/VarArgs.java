package com.chapter7Acloserlookatmethods.programs;

//Demonstrate variable-length arguments.

public class VarArgs {
	static void vaTest(int ... v)
	{
		System.out.println("Number of args: " + v.length + " Contents ");
		
		for(int x : v)
			System.out.println(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Notice how vaTest() can be called with a
		//variable number of arguments.
		
		vaTest(10);
		vaTest(1 , 2 , 3);
		vaTest();
	}
	}
