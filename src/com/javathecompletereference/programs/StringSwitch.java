package com.javathecompletereference.programs;

public class StringSwitch {
	public static void main(String[] args) {
		
		String str = "one";
		
		switch(str) {
		case "one" : 
			System.out.println("one");
			break;
		case "Two":
			System.out.println("two");
			break;
		case "three" :
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
			break;
		}
	}
}