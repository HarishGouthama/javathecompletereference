package com.chapter8Inheritance.programs;

//Method Overriding.
class AAA1{
	int i , j;
	AAA1(int a , int b){
		i = a;
		j = b;
	}
	
	//Display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class BBB1 extends AAA1{
	int k;
	
	BBB1(int a , int b , int c){
		super(a , b);
		k = c;
	}
	
	//Display k - this overrides show() in A
	void show(String msg) {
		System.out.println(msg + k);
	}
}



public class Override {
	public static void main(String[] args) {
		BBB1 subOb = new BBB1(1,2,3);
		
		subOb.show("This is k: ");
		subOb.show();
	}
}
