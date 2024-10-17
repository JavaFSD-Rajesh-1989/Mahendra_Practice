package com.CoreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class object_copy  { //Marker interface Serializable then it was adding jvm to convert object to data

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/filehandling/myanother.txt");
		FileOutputStream fwrite = new FileOutputStream(f1);
		Employee e1 = new Employee();
		e1.setName("Mahee");
		e1.setPassword("Mahee@037");
		e1.setEmail("Mahee@gmail.com");
		e1.setAddress("BANGLORE");
		e1.setSalary(3450000.0f);
		ObjectOutputStream out = new ObjectOutputStream(fwrite);
		out.writeObject(e1);
		fwrite.close();
		System.out.println("Object Written");
	}
	
}
