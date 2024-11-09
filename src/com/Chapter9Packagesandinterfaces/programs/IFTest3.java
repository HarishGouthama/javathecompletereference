package com.Chapter9Packagesandinterfaces.programs;

/*
 * Create an interface variable and
 * access stacks through it.
 *  */

public class IFTest3 {
	public static void main(String[] args) {
		
		IntStack mystack; // Create an interface reference variable
		DynStack ds 	= new DynStack(5);
		FixedStack fs 	= new FixedStack(8);
		
		mystack = ds; // Load dynamic stack
		//Push some numbers onto the stack
		for(int i = 0 ; i < 12 ; i++) mystack.push(i);
		
		mystack = fs; //Load fixed stack
		for(int i = 0 ; i < 8 ; i++) mystack.push(i);
		
		mystack = ds;
		System.out.println("Values in dynamic stack: ");
		for(int i = 0 ; i < 12 ; i++)
			System.out.println(mystack.pop());
		
		mystack = fs;
		System.out.println("Values in fixed stack: ");
		for(int i = 0 ; i < 8 ; i++)
			System.out.println(mystack.pop());
	}
}
