package com.javathecompletereference.programs;
// Using break as a civilized form of goto.
public class Break {
	public static void main(String[] args) {
		boolean t = true;
		
		first:{
			second:{
				third:{
					System.out.println("Before the break.");
					if(t) break third; // break out of second block
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block");
		}
	}
}
