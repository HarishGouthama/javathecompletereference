package com.Chapter12Enumerations.programs;
//Use an Enum Constructor.

enum Apple2
{
	Jonathan(10) , GoldenDel(9) , RedDel , Winesap(15) , Cortland(8);
	
	private int price; //Price of each apple
	
	//Constructor
	Apple2(int p)
	{
		price = p;
	}
	
	//Overloaded constructor
	Apple2()
	{
		price = -1;
	}
	
		int getPrice()
		{
			return price;
		}
	}


public class EnumDemo3Type2 {
	public static void main(String[] args) {
		System.out.println("Price of Winesap apple is L:" + Apple2.Winesap.getPrice() + " Cents. \n");
		
		System.out.println("All apple prices: ");
		for(Apple2 a : Apple2.values())
			System.out.println(a + " costs " + a.getPrice() + "Cents.");
	}
}
