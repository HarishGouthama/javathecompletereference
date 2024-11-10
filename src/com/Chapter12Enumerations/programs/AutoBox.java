package com.Chapter12Enumerations.programs;
//Demonstrate autoboxing / unboxing.

public class AutoBox {
	public static void main(String[] args) {
		
		Integer iOb = 100; //Autobox an int
		
		int i = iOb; //auto-unbox
		
		System.out.println(i + " " + iOb);
	}
}
