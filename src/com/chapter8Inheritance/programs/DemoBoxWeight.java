package com.chapter8Inheritance.programs;

//This program uses inheritance to extend Box.
class Box
{
	double width;
	double height;
	double depth;


//construct clone of an object.
Box(Box ob)
{
	//pass object to constructor.
	width  = ob.width;
	height = ob.height;
	depth  = ob.depth;
}

// Constructor used when all dimensions specified.
Box(double w , double h , double d)
{
	width  = w;
	height = h;
	depth  = d;
}

//Constructor used when no dimensions specified.
Box()
{
	width  = -1;
	height = -1;
	depth  = -1;
}

//constructor used when cube is created
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
//Here, Box is extended to include weight.
class BoxWeight extends Box
{
	double weight;
	//Constructor for BoxWeight.
	BoxWeight(double w , double h , double d , double m)
	{
		width  = w;
		height = h;
		depth  = d;
		weight = m;
	}
}

public class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox2.weight);
	}
}
