package com.Chapter10ExceptionHandling.programs;

public class throwDemo1 {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
			
		}
	}
}
