package com.javathecompletereference.programs;

public class ForVar {
	public static void main(String[] args) {
		double i;
		boolean done = false;
		
		i = 0;
		for( ; !done ; )
		{
			System.out.println("i is " + i);
			if(i == 1000000000) done = true;
			i++;
		}
	}
}
