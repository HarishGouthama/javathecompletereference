package com.Chapter15StringHandling.programs;

//Demonstrate toUpperCase() and toLowerCase().

public class ChangeCase
{
	public static void main(String[] args) 
	{
		String s = "This is a test.";
		
		System.out.println("Original : " + s);
		
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		
		System.out.println("uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}
}
