package com.javathecompletereference.programs;
//Using break to exit a while loop.
public class BreakLoop2 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 1000) {
			if(i == 998)
				break;
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Loop Complete");
	}
}
