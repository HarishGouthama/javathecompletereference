package com.Chapter15StringHandling.programs;

//Demonstrate append.

public class AppendDemo 
{
	public static void main(String[] args) 
	{
		String s;
		int a = 42;
		StringBuffer sb = new StringBuffer(40);
		
		s = sb.append("a = ").append("!").toString();
		System.out.println(s);
	}
}
