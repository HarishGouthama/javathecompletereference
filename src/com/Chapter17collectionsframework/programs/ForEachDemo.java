package com.Chapter17collectionsframework.programs;

import java.util.ArrayList;

public class ForEachDemo {
public static void main(String[] args) {
	
	//Create an arrayList for integers.
	ArrayList<Integer> vals = new ArrayList<Integer>();
	
	//Add values to the arraylist.
	
	vals.add(1);
	vals.add(2);
	vals.add(3);
	vals.add(4);
	vals.add(5);
	
	//Use for loop to display the values.
	System.out.println("Original contents of vals : ");
	
	for(int v : vals)
		System.out.println(v + " ");
	System.out.println();
	
	//now , sum the values in the loop
	int sum = 0;
	for(int v : vals)
		sum += v;
	System.out.println("Sum of the values is : " + sum);
}
}
