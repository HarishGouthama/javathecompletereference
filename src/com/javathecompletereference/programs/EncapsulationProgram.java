package com.javathecompletereference.programs;

class EncapsulationProgram {
	private int practHrs = 9;
	private String res = "JOB";
	
	public void display()
	{
		System.out.println(practHrs + " = " + res);
	}
	public class EncapsulationProg{
		public void main(String[] args) {
		EncapsulationProgram Prog = new EncapsulationProgram();
		Prog.practHrs = 0;
		Prog.res = "NO JOB";
		
		System.out.println(Prog.practHrs);
		System.out.println(Prog.res);
		Prog.display();
	}
}
}
