package com.Chapter15StringHandling.programs;

//Demonstrate charAt() and setCharAt().

public class setCharAtDemo
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Buffer before = " + sb);
		System.out.println("charAt (1) before = " + sb.charAt(1));
		sb.setCharAt(1, 'i');
		sb.setLength(6);
		System.out.println("buffer after = " + sb);
		System.out.println("CharAt (1) after = " + sb.charAt(1));
	}
}
