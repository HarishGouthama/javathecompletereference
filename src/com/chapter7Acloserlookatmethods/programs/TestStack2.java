package com.chapter7Acloserlookatmethods.programs;

//Improved Stack class that uses the length array member.

class Stack1
{
	private int stck[];
	private int tos;
	
	//Allocate and initialize stack.
	Stack1(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	//Push an item onto the stack
	
	void push(int item)
	{
		if(tos == stck.length-1) // Use length member
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	//Pop an item from the stack.
	
	int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack Underflow.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}

public class TestStack2 {
	public static void main(String[] args) {
		Stack1 mystack1 = new Stack1(5);
		Stack1 mystack2 = new Stack1(8);
		
		//Push some numbers onto the stack.
		
		for(int i = 0 ; i < 5 ; i++) mystack1.push(i);
		for(int i = 0 ; i < 8 ; i++) mystack2.push(i);
		
		//Pop those numbers off the stack
		
		System.out.println("Stack in myStack1:");
		for(int i = 0 ; i < 8 ; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i = 0 ; i < 8 ; i++)
			System.out.println(mystack2.pop());
	}
}
