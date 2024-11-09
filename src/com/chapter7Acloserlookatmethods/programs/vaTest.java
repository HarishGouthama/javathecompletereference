package com.chapter7Acloserlookatmethods.programs;

//Use varargs with standard arguments.

public class vaTest {
	
	//Here, msg is a normal parameter and v is a
	//varargs parameter.
	
	static void vaTest(String msg , int ... v)
	{
		System.out.println(msg + v.length + " Contents: ");
		
		for(int x : v)
			System.out.println(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest("One vararg : " , 10);
		vaTest("Three varargs : " , 1 , 2 , 3);
		vaTest("No varargs: ");
	}
}
