package com.Chapter6Classes.programs;

/* Here, Box uses a parameterized constructor to initialize
 * the dimensions of a box.
 */

class Box7
{
	double width;
	double height;
	double depth;
	
//This is the constructor for Box.
	
	Box7(double w , double h , double d)
	{
		width = w;
		height = h;
		depth = d;
	}


// Compute and return volume
double volume()
{
	return width * height * depth;
}
}

public class BoxDemo7 {
	public static void main(String[] args) {
		//Declare , allocate and initialize Box Objects
		
		Box7 myBox1 = new Box7(60,  70,  90);
		Box7 myBox2 = new Box7(100, 150, 200);
		
		double vol;
		
		//get volume of the first box.
		vol = myBox1.volume();
		System.out.println("Volume is " + vol);
		
		//Get Volume of the second Box
		vol = myBox2.volume();
		System.out.println("Volume is " + vol);
	}
}
