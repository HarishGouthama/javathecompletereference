package MyPack;

// This Program uses a parameterized method.

class Box5
{
	double width;
	double height;
	double depth;
	
	// Compute and return volume.
	double volume()
	{
		return width * height * depth;
	}
	
	//Sets dimensions of box.
	void setDim(double w , double h , double d)
	{
		width  = w;
		height = h;
		depth  = d;
	}
}


public class BoxDemo5 {
	public static void main(String[] args) {
		Box5 myBox1 = new Box5();
		Box5 myBox2 = new Box5();
		double vol;
		
		//initialize each box.
		
		myBox1.setDim(17.5, 18.5, 19.5);
		myBox2.setDim(10.6, 11.6, 12.6);
		
		//Get volume of first box.
		vol = myBox1.volume();
		System.out.println("Volume is " + vol);
		
		//get volume of second box.
		vol = myBox2.volume();
		System.out.println("VOlume is " + vol);
	}
}
