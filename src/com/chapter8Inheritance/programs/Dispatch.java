package com.chapter8Inheritance.programs;

//Dynamic Method Dispatch
class A{
	void callme() {
		System.out.println("Inside A's callme method");
	}
}

class B extends A{
	//override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}

class C extends A{
	//override callme()
	void callme() {
		System.out.println("Inside C's callme method");
	}	
}


public class Dispatch {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		
		r = a;
		r.callme();
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();
	}
}
