package com.Chapter16Javalang.programs;

public class ShowUserDir
{
	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("java.class.version"));
		
	}
}
