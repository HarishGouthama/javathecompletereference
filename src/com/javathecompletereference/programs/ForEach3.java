package com.javathecompletereference.programs;
// Use for-each style for on a two dimensional array.
public class ForEach3 {
	public static void main(String[] args) {
		int sum = 0;
		int nums[][] = new int[3][5];
		
		// Give nums some values
		for(int i = 0 ; i < 3 ; i++)
			for(int j = 0 ; j < 5 ; j++)
				nums[i][j] = (i+1) * (j*1);
		
		// Use for-each for to display and sum the values.
		for(int x[] : nums) {
			for(int y : x) {
				System.out.println("Value is: " + y);
				sum += y;
			}
		}
		System.out.println("Summation is : " + sum);
	}

}
