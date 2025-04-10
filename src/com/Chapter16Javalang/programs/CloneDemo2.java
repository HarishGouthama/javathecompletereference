package com.Chapter16Javalang.programs;

//Override the clone() method

class TestClone1 implements Cloneable
{
	int		a;
	double	b;
	
	//clone() is now overridden and is public.
	
	public Object clone()
	{
		try
		{
			//call clone in object.
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}

public class CloneDemo2
{
	public static void main(String[] args) 
	{
		TestClone1 x1 = new TestClone1();
		TestClone1 x2;
		
		x1.a = 10;
		x1.b = 20.98;
		
		x2 = (TestClone1) x1.clone();
		
		System.out.println("X1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}
}
