package com.Chapter15StringHandling.programs;

//StringBuffer length v/s capacity

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("Buffer 	 = " + sb);
		System.out.println("length   = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());
	}
}
