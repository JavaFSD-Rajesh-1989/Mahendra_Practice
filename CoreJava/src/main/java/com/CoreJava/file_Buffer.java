package com.CoreJava;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class file_Buffer {

		public static void main(String[] args) throws IOException {
			
			File f2 = new File("c:/filehandling/myanother.txt");
			//reading in byte mode to copy contents using file class
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the data");
			String inputdata=br.readLine();
			FileOutputStream fwrite = new FileOutputStream(f2);
			for( int i=0; i<inputdata.length();i++ ) 
			{
				fwrite.write(inputdata.charAt(i));
			}
			fwrite.close();
			System.out.println("Data Copied Succesfully");
		}
	}

