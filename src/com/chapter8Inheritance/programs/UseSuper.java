package com.chapter8Inheritance.programs;

//Using super to overcome hiding.

class AAA
{
	int i;
}

//Create a subclass by extending class A.

class BBB extends AAA
{
	int i; //This i hides i in A.
	
	BBB(int a , int b)
	{
		super.i = a; //i in A
		i = b; // i in B
	}
	
	void show()
	{
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

public class UseSuper {
	public static void main(String[] args) {
		BBB subOb = new BBB(1,2);
		
		subOb.show();
	}
}
