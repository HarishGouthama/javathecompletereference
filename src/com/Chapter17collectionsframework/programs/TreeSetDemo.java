package com.Chapter17collectionsframework.programs;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	
	TreeSet<String> ts = new TreeSet<String>();
	
	//Add the elements to the tree set.
	ts.add("C");
	ts.add("A");
	ts.add("B");
	ts.add("E");
	ts.add("F");
	ts.add("D");
	
	System.out.println(ts);
	
	System.out.println(ts.subSet("C", "F"));
}
}
