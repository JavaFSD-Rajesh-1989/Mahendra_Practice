package com.CoreJava;

public class SingletonClass {

	private static SingletonClass instance;
	
	private SingletonClass() //constructor
	{
		
	}
	public static synchronized SingletonClass getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonClass();
		}
		return instance;
	}
}
