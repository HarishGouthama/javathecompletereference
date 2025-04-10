package com.Chapter16Javalang.programs;

//Timing program execution.

public class Elapsed 
{
	public static void main(String[] args) 
	{
		long start , end;
		
		System.out.println("Timing a for loop from 0 to 1,000,000");
		
		//time a for loop from 0 to 1,000,000
		
		//start = System.currentTimeMillis(); //get starting time
		start = System.nanoTime();
		System.out.println(start);
		
		for(int i = 0 ; i < 1000000 ; i++);
		
		//end = System.currentTimeMillis(); //get ending time
		end = System.nanoTime();
		System.out.println(end);
		
		System.out.println("Elapsed time: " + (end - start));
	}
}
