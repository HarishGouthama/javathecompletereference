package com.Chapter17collectionsframework.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Demonstrate iterators

public class IteratorDemo {
public static void main(String[] args) {
	
	//Create an array list.
	ArrayList<String> arrayList = new ArrayList<String>();
	
	//Add Elements to the array list.
	
	arrayList.add("C");
	arrayList.add("A");
	arrayList.add("E");
	arrayList.add("B");
	arrayList.add("D");
	arrayList.add("F");
	
	//Use iterator to display contents of array list.
	System.out.println("Original Contents of arrayList : ");
	Iterator<String> itr = arrayList.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		System.out.println(element + " ");
	}
	System.out.println();
	
	//Modify Objects being iterated.
	ListIterator<String> litr = arrayList.listIterator();
	while(litr.hasNext()) {
		String element = litr.next();
		litr.set(element + "+");
	}
	
	System.out.println("Modified Contents of al : ");
	itr = arrayList.iterator();
	while(itr.hasNext()) {
		String element = itr.next();
		System.out.println(element + " ");
	}
	System.out.println();
	
	//Now display the list backwards
	System.out.println("Modified list backwards : ");
	while(litr.hasPrevious()) {
		String element = litr.previous();
		System.out.println(element + " ");
	}
	System.out.println();
}
}
