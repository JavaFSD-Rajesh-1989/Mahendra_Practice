package com.LinkedIn.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	private static Connection con; 
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connection to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
