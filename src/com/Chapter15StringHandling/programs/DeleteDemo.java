package com.Chapter15StringHandling.programs;

//Demonstrate delete() and deleteCharAt()

public class DeleteDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Thisisatest.");
		
		sb.deleteCharAt(0);
		System.out.println("After deleteCharAt: " + sb);
		
		sb.delete(4, 7);		
		System.out.println("After delete: " + sb);
		
		sb.deleteCharAt(0);
		System.out.println("After deleteCharAt: " + sb);
	}
}
