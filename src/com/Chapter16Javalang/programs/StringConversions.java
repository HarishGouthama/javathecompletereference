package com.Chapter16Javalang.programs;
/* Convert an integer into binary , hexadecimal and Octal.
 * */

public class StringConversions
{	
	public static void main(String[] args) 
	{
		int num = 19486;
		
		System.out.println(num + " in Binary: " + Integer.toBinaryString(num));
		 
		System.out.println(num + " in Octal: " + Integer.toOctalString(num));
		
		System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
	}
}
