package com.Chapter17collectionsframework.programs;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
public static void main(String[] args) {
	//Create a tree set.
	ArrayDeque<String> arraydeque = new ArrayDeque<String>();
	
	//Use an ArrayDeque like a stack.
	arraydeque.push("A");
	arraydeque.push("B");
	arraydeque.push("C");
	arraydeque.push("D");
	arraydeque.push("E");
	arraydeque.push("F");
	
	System.out.println("Popping the stack : ");
	
	while(arraydeque.peek() != null)
		System.out.println(arraydeque.pop());
	
	System.out.println();
}
}
