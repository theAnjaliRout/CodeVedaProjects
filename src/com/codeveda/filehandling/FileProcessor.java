package com.codeveda.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter an input file path::");
		String input=sc.nextLine();
		
		System.out.print("Enter an output file path:: ");
		String output=sc.nextLine();
		
		int lineCount=0;
		int wordCount=0;
		
		try
		{
			File file=new File(input);
			Scanner reader=new Scanner(file);
			
			while(reader.hasNextLine())
			{
				String line=reader.nextLine();
				lineCount++;
				
				String[] words=line.trim().split("\\s+");
				if(!line.trim().isEmpty())
				{
					wordCount+=words.length;
				}
			}
			reader.close();
			
			FileWriter writer=new FileWriter(output);
			writer.write("File Processed:\n");
			writer.write("Total Lines: "+lineCount+"\n");
			writer.write("Total words: "+wordCount+"\n");
			writer.close();
			
			System.out.println("Processing complete.Output written to "+output +".");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error:Input file not found: "+input);
		}
		catch (IOException e) 
		{
			System.out.println("Error while writing to output file.");
		}
		
	}

}