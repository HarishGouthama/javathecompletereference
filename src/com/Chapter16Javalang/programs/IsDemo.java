package com.Chapter16Javalang.programs;

//Demonstrate several Is....Methods

public class IsDemo
{
	public static void main(String[] args) 
	{
		char a[] = { 'a' , 'b' , '5' , '?' , 'A' , ' ' };
		System.out.println(a);
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(Character.isDigit(a[i]))
				System.out.println(a[i]);
			System.out.println(a[i] + " is a Digit.");
			if(Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is a uppercase.");
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is a lowercase.");
		}
	}
}
