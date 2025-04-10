package com.Chapter14Generics.programs;

//Demonstrate a simple generic method.
public class GenMethDemo {
	
	//Determine if an object is in an array.
	static < T , V extends T> boolean isIn(T x , V[] y)
	{
		
		for(int i = 0 ; i < y.length ; i++)
			if(x.equals(y[i])) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		//use isIn() on integers.
		Integer nums[] = { 1 , 2 , 3 , 4 , 5 };
		
		if(isIn(2 , nums))
			System.out.println("2 is in nums");
		
		if(!isIn(7 , nums))
			System.out.println("7 is not in the nums");
		
		System.out.println();
		
		//Use isIn() on strings.
		String strs[] = { "one" , "two" , "Three" , "four" , "five" };
		
		if(isIn("two", strs))
			System.out.println("Two is in strs");
		
		if(!isIn("Seven" , strs))
			System.out.println("Seven is not in strs");
	}
}
