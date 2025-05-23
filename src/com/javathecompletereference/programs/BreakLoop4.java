package com.javathecompletereference.programs;
// Using break to exit from nested loops.
public class BreakLoop4 {
	public static void main(String[] args) {
		outer: for(int i = 0 ; i < 3 ; i++) {
			System.out.println("Pass " + i + ": ");
			for(int j = 0 ; j < 11 ; j++){
				if(j == 10) break outer; // exit both loops
				System.out.println(j + " ");
			}
			System.out.println("This will not print");
		}
		System.out.println("Loops Complete.");
	}

}
