package com.Chapter15StringHandling.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim
{
	public static void main(String[] args) throws IOException 
	{
		//Create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Enter 'stop' to quit.");
		System.out.println("Enter State: ");
		do
		{
			str = br.readLine();
			str = str.trim();   //remove whitespace
			
			if(str.equals("illinois"))
				System.out.println("Capital is Springfield");
			else if(str.equals("Missori"))
				System.out.println("Capital is Jefferson City.");
			else if(str.equals("California"))
				System.out.println("Capital is Sacramento");
			else if(str.equals("Washington"))
				System.out.println("Capital is Olympia.");
			//...
		}
		while(!str.equals("Stop"));
	}
}
