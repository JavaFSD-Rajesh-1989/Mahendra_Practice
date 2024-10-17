package com.CoreJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Read_Write {

	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/filehandling/mynew.txt");
		File f2 = new File("c:/filehandling/mynew2.txt");
		//reading in byte mode to copy contents using file class
		FileInputStream fread = new FileInputStream(f1);
		FileOutputStream fwrite = new FileOutputStream(f2);
		int c=0;
		while(!((c=fread.read())==-1)) //-1 is ASCII value of end of the file if it reaches then it is an end
		{
			fwrite.write(c);
		}
		fwrite.close();
		fread.close();
		System.out.println("Data Copied Succesfully");
	}
}
