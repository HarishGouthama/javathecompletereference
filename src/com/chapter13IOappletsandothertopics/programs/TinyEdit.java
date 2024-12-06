package com.chapter13IOappletsandothertopics.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit 
{
	public static void main(String[] args) throws IOException
	{
		//Create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter lines to stop");
		
		for(int i = 0 ; i < 100 ; i++)
		{
			str[i] = br.readLine();
			if(str[i].equals("Stop"))
				break;
		}
		
		System.out.println("\nHere is your file: ");
		
		for(int i = 1 ; i < 100 ; i++)
		{
			if(str[i].equals("Stop"))
				break;
			System.out.println(str[i]);
		}
	}
}
