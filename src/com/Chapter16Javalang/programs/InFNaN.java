package com.Chapter16Javalang.programs;

//Demosntrate isInfinite() and isNaN()

public class InFNaN
{
	public static void main(String[] args) 
	{
		Double d1 = new Double(1/0.0);
		System.out.println(d1);
		
		
		Double d2 = new Double(0/0.0);
		System.out.println(d2);
		
		System.out.println(d1 + " : " + d1.isInfinite() + " , " + d2.NaN);
		System.out.println(d2 + " : " + d2.isInfinite() + " , " + d1.NaN);
		
	}
}
