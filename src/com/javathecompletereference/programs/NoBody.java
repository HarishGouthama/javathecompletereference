package com.javathecompletereference.programs;

public class NoBody {
	public static void main(String[] args)
	{
		int i, j;
		
		i = 100;
		j = 200;
		
		// Find the midpoint between i and j
		while(++i < --j); 
		System.out.println("Midpoint is " + i);
	}
}