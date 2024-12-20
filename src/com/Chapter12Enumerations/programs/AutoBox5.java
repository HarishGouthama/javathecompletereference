package com.Chapter12Enumerations.programs;
//Autoboxing / unboxing a Boolean and Character.


public class AutoBox5 {
	public static void main(String[] args) {
		
		
		//Autobox / unbox a boolean.
		Boolean b = true;
		
		// Below, b is auto-unboxed when used in
		// a conditional expression ,  such as an if.
		
		if(b) System.out.println("b is true");
		
		// Autobox / unbox  a char.
		Character ch = 'x'; //Box a char
		char ch2 = ch; // unbox a char
		
		System.out.println("ch2 is " + ch2);
	}
}
