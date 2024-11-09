package MyPack;
/*Here , Box uses a constructor to initialise the dimension
 * of a box.
 */

class Box6
{
	double width;
	double height;
	double depth;


//This is the constructor for Box.

Box6()
{
	System.out.println("Constructing Box");
	width 	= 10;
	height	= 10;
	depth   = 10;
}

//Compute and return volume.
double volume()
{
	return width * height * depth;
}
}
public class BoxDemo6 {
	public static void main(String[] args) {
		// Declare , allocate and initialize Box Objects
		
		Box6 myBox1 = new Box6();
		Box6 myBox2 = new Box6();
		
		double vol;
		
		//Get volume of first box
		vol = myBox1.volume();
		System.out.println("Volume is " + vol);
		
		//Get volume of second box
		vol = myBox2.volume();
		System.out.println("Volume is " + vol);
		
	}
}
