package com.Chapter12Enumerations.programs;

//Autoboxing / unboxing takes place with
//method parameters and return values.

public class AutoBox2 {
	//Take an integer parameter and return 
	// an int value;
	
	static int m(Integer v)
	{
		return v; //auto-unbox to int
	}
	
	public static void main(String[] args) {
		/*Pass an int to m() and assign the return value
		 * to an Integer. Here, the argument 100 id autoboxed
		 * into an integer. The return value is also autoboxed
		 * into an Integer.
		 */
		Integer iOb = m(100);
		
		System.out.println(iOb);
	}
}
