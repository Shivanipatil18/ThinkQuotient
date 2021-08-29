package pkg;

import java.io.FileNotFoundException;

import java.io.*;
import java.io.IOException;
import java.io.FileReader;


public class FileReading  {

	public static void main(String[] args)throws IOException
	{
		
		//FileReader fr=new FileReader();
		int ch;
		FileReader fr=null;
		try
		{
		fr=new FileReader("E:\\data.txt");
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
			System.out.print("*");
			
		}
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File Not Found");
			
		}
		fr.close();
		
	}

	

}
