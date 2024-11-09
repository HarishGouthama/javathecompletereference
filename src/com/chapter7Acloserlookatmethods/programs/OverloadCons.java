package com.chapter7Acloserlookatmethods.programs;
/* Here , Box defines three constructors to initialize
 * the dimensions of a box various ways.
 */

class Box
{
	double width;
	double height;
	double depth;
	
	// Constructor used all dimensions specified.
	Box(double w , double h , double d)
	{
		width  = w;
		height = h;
		depth  = d;
	}
	
	//Constructor used when no dimensions specified.
	Box()
	{
		width  = -16;
		height = -18;
		depth  = -19;
	}
	
	//Constructor used when cube is created.
	Box(double len)
	{
		width = height = depth = len;
	}
	
	//compute and return volume.
	double volume()
	{
		return width * height * depth;
	}
}

public class OverloadCons {
	public static void main(String[] args) {
		//Create boxes using various constructors.
		Box myBox1  = new Box(10,20,15);
		Box myBox2  = new Box();
		Box mycube  = new Box(7);
		
		double vol;
		
		//get volume of first box.
		vol = myBox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		//get volume of second box.
		vol = myBox2.volume();
		System.out.println("Volume of myBox2 is " + vol);
		
		//get volume of cube.
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
	}
}
