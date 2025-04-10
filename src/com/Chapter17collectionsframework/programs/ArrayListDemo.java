package com.Chapter17collectionsframework.programs;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//Create an array list.
	
	ArrayList<String> arrayList = new ArrayList<String>();
	
	System.out.println("Initial size of arrayList : " + arrayList.size());
	
	//Adding elements to arrayList.
	
	arrayList.add("C");
	arrayList.add("A");
	arrayList.add("E");
	arrayList.add("B");
	arrayList.add("D");
	arrayList.add("F");
	arrayList.add(1 , "A2");
	
	System.out.println("Size of arrayList after additions : " + arrayList.size());
	
	//Display the arrayList.
	System.out.println("Contents of arrayList : " + arrayList);
	
	//Remove elements from the arrayList.
	arrayList.remove("F");
	arrayList.remove(2);
	
	System.out.println("Size of arrayList after deletions : " + arrayList.size());
	
	System.out.println("Contents of arrayList : " + arrayList);
}
}
