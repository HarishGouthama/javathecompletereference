package com.Chapter16Javalang.programs;

public class ExecDemo
{
	public static void main(String[] args) 
	{
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try
		{
			p = r.exec("cmd");
		}
		catch(Exception e)
		{
			System.out.println("Error executing notepad.");
		}
	}
}
