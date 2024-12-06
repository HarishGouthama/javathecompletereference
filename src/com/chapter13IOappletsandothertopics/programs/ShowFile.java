package com.chapter13IOappletsandothertopics.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Display a Text file.
 * 
 * To use this program, specify the name
 * of the file that you want to see.
 * For example, to see a file called TEST.TXT,
 * use the following command line.
 * 
 * java showFile TEST.TXT
 * 
 */


public class ShowFile {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin;
		
		try {
			fin = new FileInputStream(args[0]);
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Usage : ShowFile File");
			return;
		}
		do
		{
			i = fin.read();
			if(i != -1) System.out.println((char) i);
		}while(i != -1);
		fin.close();
	}
}
