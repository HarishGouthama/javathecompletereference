package com.chapter13IOappletsandothertopics.programs;
/* Copy a text file.
 * 
 * To use this program , specify the name
 * of the source file and the destination file.
 * for example , to copy a file called FIRST.TXT
 * to a file called SECOND.TXT , use the following
 * command line.
 * 
 * java CopyFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		try
		{
			//open input file
			try
			{
				fin = new FileInputStream(args[0]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Input File Not Found");
				return;
			}
			//open output file
			try
			{
				fout = new FileOutputStream(args[1]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Error Opening Output File.");
				return;
			}
			
			//Copy File
			try
			{
				do
				{
					i = fin.read();
					if(i != -1) fout.write(i);
				}
				while(i != -1);
			}
			catch(IOException e)
			{
				System.out.println("FIle Error");
			}finally {
				try {
					if(fin != null)fin.close();
					if(fout != null)fout.close();
				}catch(IOException e) {
					System.out.println("Error closing the file streams.");
				}
			}
			
		
	}
}
