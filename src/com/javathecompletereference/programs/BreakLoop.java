package com.javathecompletereference.programs;
// Using break to exit a loop.
public class BreakLoop {
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			if(i == 96) break; // terminates the loop
		System.out.println("i : " + i);
	}
	System.out.println("Loop Complete");
}
}