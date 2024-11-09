package com.Chapter6Classes.programs;

//This program includes a method inside the box class.

class Box3
{
	double width;
	double height;
	double depth;


// Display volume of a box.

void volume()
{
	System.out.println("Volume is ");
	System.out.println(width * height * depth);
}
}

public class BoxDemo3 {
	public static void main(String[] args) {
		Box3 myBox1 = new Box3();
		Box3 myBox2 = new Box3();
		
		// Assign values to myBox1's instance variables
		myBox1.width 	= 10;
		myBox1.height	= 20;
		myBox1.depth	= 15;
		
		//Assign different values to myBoc1's instance variables.
		myBox2.width	= 3;
		myBox2.height	= 6;
		myBox2.depth	= 9;
		
		//Display volume of first box
		myBox1.volume();
		
		//Display volume of second box
		myBox2.volume();
	}

}
