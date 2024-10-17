package com.CoreJava;

import java.io.File;
import java.io.IOException;

public class File_Demo {

	public static void main(String[] args) throws IOException {
		File f= new File("c:/filehandling/mynew.txt");
		
		if(f.createNewFile())
		{
			System.out.println("New File Created");
		}
	}
}
