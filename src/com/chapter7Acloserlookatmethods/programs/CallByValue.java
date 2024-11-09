package com.chapter7Acloserlookatmethods.programs;
//Primitive types are passed by value.

class Test1
{
	void meth(int i , int j)
	{
		i *= 2;
		j /= 2;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		
		Test1 ob = new Test1();
		
		int a = 15 , b = 20;
		
		System.out.println("a and b before call: "+ a + " " + b);
		
		ob.meth(10 , 25);
		
		System.out.println("a and b after the call: " + a + " " + b);
	}
}
