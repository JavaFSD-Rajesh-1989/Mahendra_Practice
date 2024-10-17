package com.LinkedIn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.LinkedIn.Entity.LinkedInUserEntity;
import com.LinkedIn.utility.DataBaseConnection;

public class LinkedIndao implements LinkedInDaoInterface {

	

	@Override
	public int CreateProfileDao(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub\
		//load the driver
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connection to database
			Connection con = DataBaseConnection.getConnection();
			//step 3 generate dynamic query
			PreparedStatement ps = con.prepareStatement("insert into LinkedIntable values(?,?,?,?)");
			ps.setString(1,lu.getName());
			ps.setString(2, lu.getPassword());
			ps.setString(3, lu.getEmail());
			ps.setString(4, lu.getAddress());
			
			i=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public LinkedInUserEntity ViewProfileDao(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInUserEntity l2 = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("select * from LinkedIntable where email = ?");
			ps.setString(1,lu.getEmail());
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				
				l2=new LinkedInUserEntity();
				l2.setName(a);
				l2.setPassword(b);
				l2.setEmail(c);
				l2.setAddress(d);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l2;
	}

	@Override
	public List<LinkedInUserEntity> ViewAllProfileDao() {
		// TODO Auto-generated method stub
		List<LinkedInUserEntity> ll = new ArrayList<LinkedInUserEntity>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("select * from LinkedIntable");
			ResultSet res = ps.executeQuery();
			while(res.next())
			{
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3); //it is the schema to build to store values
				String d=res.getString(4);
				
				LinkedInUserEntity l2 =new LinkedInUserEntity();
				l2.setName(a);
				l2.setPassword(b);
				l2.setEmail(c); // it is the values to be stored
				l2.setAddress(d);
				
				ll.add(l2);
			}
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public int EditProfileDao(LinkedInUserEntity ll) {
		// TODO Auto-generated method stub
		int i=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("update LinkedIntable set password=?,address=? where email=?");
			ps.setString(1, ll.getPassword());
			ps.setString(2, ll.getAddress());
			ps.setString(3, ll.getEmail());
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
		return i;
	}

	@Override
	public int DeleteProfileDao(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("delete  from LinkedIntable  where email=?");
			ps.setString(1,lu.getEmail());
			i=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}

	@Override
	public LinkedInUserEntity SearchProfileDao(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
LinkedInUserEntity l2 = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("select * from LinkedIntable where email = ?");
			ps.setString(1,lu.getEmail());
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				
				l2=new LinkedInUserEntity();
				l2.setName(a);
				l2.setPassword(b);
				l2.setEmail(c);
				l2.setAddress(d);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l2;
	}
		

	@Override
	public LinkedInUserEntity LoginProfileDao(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
LinkedInUserEntity l2 = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkedindatabase","root", "root");
			PreparedStatement ps = con.prepareStatement("select * from LinkedIntable where email = ?");
			ps.setString(1,lu.getEmail());
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				String a=res.getString(1);
//				String b=res.getString(2);
				String c=res.getString(2);
				String d=res.getString(3);
				
				l2=new LinkedInUserEntity();
				l2.setName(a);
//				l2.setPassword(b);
				l2.setEmail(c);
				l2.setAddress(d);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l2;
	}

}
