package com.javathecompletereference.programs;

public class DoWhile {
	public static void main(String[] args) {
		int n = 1000000 ;
		
		do {
			System.out.println("Tick " + n);
			n--;
		} while (n > 0);
	}
}