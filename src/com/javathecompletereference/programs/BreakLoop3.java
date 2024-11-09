package com.javathecompletereference.programs;
// Using Break with Nested Loops.
public class BreakLoop3 {
	public static void main(String[] args) {
		for(int i =0 ; i < 1000000000 ; i++) {
			System.out.println("Pass " + i + ": ");
			for(int j = 0 ; j < 1000 ; j++) {
				if(j == 998)
					break; //terminate loop if j is 10
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Loops Complete.");
	}

}
