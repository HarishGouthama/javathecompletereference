package com.Chapter16Javalang.programs;

public class DoubleDemo
{
	public static void main(String[] args) 
	{
		Double d1 = new Double(3.14159);
		System.out.println(d1);
		
		Double d2 = new Double("314159E-5");
		System.out.println(d2);
		
		System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));
		
	}
}
