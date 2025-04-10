package com.Chapter15StringHandling.programs;

//Demonstrate replace()

public class ReplaceDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("This is a test.");
		sb.replace(5 , 7 , "wasn't");
		System.out.println(sb);
	}
}
