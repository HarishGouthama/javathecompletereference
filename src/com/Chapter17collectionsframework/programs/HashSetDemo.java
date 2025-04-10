package com.Chapter17collectionsframework.programs;

import java.util.HashSet;

//Demonstrate HashSet.
public class HashSetDemo {
public static void main(String[] args) {
	
	//Create a HashSet.
	
	HashSet<String> hs = new HashSet<String>();
	
	//Add elements to the hash set.
	hs.add("B");
	hs.add("A");
	hs.add("D");
	hs.add("E");
	hs.add("C");
	hs.add("F");
	
	System.out.println(hs);
}
}
