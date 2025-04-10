package com.Chapter16Javalang.programs;

//Demonstrates Run-Type Type Information

class X{
	int a;
	float b;
}

class Y extends X{
	double c;
}

public class RTTI {
public static void main(String[] args) {
	
	X x = new X();
	Y y = new Y();
	Class<?> clObj;
	
	clObj = x.getClass();
	System.out.println("x is the object of type: " + clObj.getName());
	
	clObj = y.getClass();
	System.out.println("y is the object of type: " + clObj.getName());
	
	clObj = clObj.getSuperclass();
	System.out.println("y's superclass is " + clObj.getName());
	
}
}
