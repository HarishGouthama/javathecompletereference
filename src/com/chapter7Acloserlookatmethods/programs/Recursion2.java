package com.chapter7Acloserlookatmethods.programs;

//Another example that uses recursion.

class RecTest
{
	int values[];
	
	RecTest(int i)
	{
		values = new int[i];
	}
	
	//Display array -- recursively
	void printArray(int i)
	{
		if(i == 0) return;
		else printArray(i-1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}

public class Recursion2 {
	public static void main(String[] args) {
		RecTest ob = new RecTest(100);
		int i;
		
		for(i = 0 ; i < 100 ; i++)
			ob.values[i] = i;
		
		ob.printArray(100);
	}
}
