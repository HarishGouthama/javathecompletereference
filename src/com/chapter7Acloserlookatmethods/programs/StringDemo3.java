package com.chapter7Acloserlookatmethods.programs;

//Demonstrating String Arrays.

public class StringDemo3 {
	public static void main(String[] args) {
		String str[] = { "One" , "Two" , "Three" };
		
		for(int i = 0 ; i < str.length ; i++)
			System.out.println("str[" + i + "]: " +  str[i]);
	}
}
