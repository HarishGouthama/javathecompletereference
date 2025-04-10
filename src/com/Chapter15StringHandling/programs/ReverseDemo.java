package com.Chapter15StringHandling.programs;

//Using reverse() to reverse a StringBuffer

public class ReverseDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer("123456");
		s.reverse();
		System.out.println(s);
	}
}
