package MyPack;
// This Program declares two Box Objects.

class Box2{
	double width;
	double height;
	double depth;
}

public class BoxDemo2 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		double vol;
		
		// Assign values to myBox1's instance variables.
		myBox1.width  = 10;
		myBox1.height = 20;
		myBox1.depth  = 15;
		
		// Assign different values to mybox2's instance variables.
		
		myBox2.width  = 3;
		myBox2.height = 6;
		myBox2.depth  = 9;
		
		// Compute volume of first box.
		vol = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println("Volume is " + vol);
		
		//Compute Volume of Second box.
		vol = myBox2.width * myBox2.height * myBox2.depth;
		System.out.println("Volume is " + vol);
	}
}
