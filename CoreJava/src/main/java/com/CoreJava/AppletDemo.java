package com.CoreJava;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;



public class AppletDemo extends Applet implements Runnable{ //Applet is Deprecated

	Thread t;
	String Str;
	public void init()
	{
		t=new Thread(this);
		Str="";
		t.start();
	}
	public void Service()
	{
	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			Date d = new Date();
			Str =d.toString();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Mahee", 100, 100);
	}


}
