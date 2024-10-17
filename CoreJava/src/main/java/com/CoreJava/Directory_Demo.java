package com.CoreJava;

import java.io.File;

public class Directory_Demo {

	public static void main(String[] args) {
		File f= new File("c://filehandling");
		if(f.mkdir())
		{
			System.out.println("Directory Created");
		}
		else
		{
			System.out.println("Not Created Directory");
		}
	}
}
