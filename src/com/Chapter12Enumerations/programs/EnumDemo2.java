package com.Chapter12Enumerations.programs;

//Use the built in enumeration methods.

//An enumeration of apple varieties.

enum Apple0
{
	Jonathan , GoldenDel , RedDel , Winesap , Cortland
}

public class EnumDemo2 
{
public static void main(String[] args) 
{
	Apple0 ap;
	
	System.out.println("Here are all Apple constants: ");
	
	//Use Values()
	Apple0 allapples[] = Apple0.values();
	for(Apple0 a : allapples)
		System.out.println(a);
	
		System.out.println();
		
		//Use valuesOf()
		ap = Apple0.valueOf("Winesap");
		System.out.println("ap contains " + ap);
}
}
