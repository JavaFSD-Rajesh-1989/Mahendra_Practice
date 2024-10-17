package com.CoreJava;

class A extends Thread
{
	int i=1;
	A(Shared s, String ss)
	{
		super(ss);
	}
	void changetValue()
	{
		i=2;
		notify();
	}
	
}
class B extends Thread
{	int i;
	B(Shared s, String ss)
	{
		super(ss);
		this.i=s.i;
	}
	int getValue(int i)
	{
		try
		{
		wait();
		return i;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return
}
class Shared
{
	static int i=1;
	B.getValue(i);
}



public class waitnotifyDemo {

	public static void main(String[] args) {
		A a = new A(new Shared(),"Thread A");
	}
	
	
	
}
