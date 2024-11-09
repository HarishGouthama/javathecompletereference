package com.javathecompletereference.programs;
// Use break with a for-each style for.
public class ForEach2 {
	public static void main(String[] args) {
		int sum = 0;
		int num[] = { 1,2,3,4,5,6,7,8,9,10};
		
		//Use for to display and sum the values
		for(int x : num) {
			System.out.println("Value is : " + x);
			sum += x;
			if(x == 8) break; // stop the loop when 5 is obtained.
		}
		System.out.println("Summation of first 5 elements : " + sum);
	}
}
