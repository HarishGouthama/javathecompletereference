package com.Chapter17collectionsframework.programs;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	//Add elements to the linkedhashset.
	
	lhs.add("B");
	lhs.add("A");
	lhs.add("D");
	lhs.add("E");
	lhs.add("C");
	lhs.add("F");
	
	System.out.println(lhs);
}
}
