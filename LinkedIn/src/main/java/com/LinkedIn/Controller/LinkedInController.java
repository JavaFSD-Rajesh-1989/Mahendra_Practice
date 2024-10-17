package com.LinkedIn.Controller;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.LinkedIn.Entity.LinkedInUserEntity;
import com.LinkedIn.Exception.ProfileNotFoundException;
import com.LinkedIn.Service.LinkedInService;
import com.LinkedIn.Service.LinkedInServiceInterface;
import com.LinkedIn.utility.*;

public class LinkedInController implements LinkedInControllerInterface {
	Logger log = Logger.getLogger("LinkedInView");
	//Logger log = LoggerFactory.getLogger();// for the log back version
	
	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter Password ");
		String password=sc.next();
		System.out.println("Enter Email ");
		String email=sc.next();
		System.out.println("Enter Address ");
		String address=sc.next();
		
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		LinkedInServiceInterface ls = new LinkedInService();
		int i = ls.CreateProfileService(lu);
		if(i>0)
		{
			log.info("Profile Created"+LocalDateTime.now());
		}
		else
		{	
		log.error("Profile Not Created");
		}//log back and login level to debug trash error info back
	}
	
	
	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to view profile");
		String email=sc.next();
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setEmail(email);
		LinkedInServiceInterface ls = new LinkedInService();
		LinkedInUserEntity ll = ls.ViewProfileService(lu);
		try
		{
			if(ll!=null)
			{
				System.out.println("Your Profile is ");
				System.out.println("Name is --->" + ll.getName());
				System.out.println("Password is --> "+ll.getPassword());
				System.out.println("Email is -->"+ll.getEmail());
				System.out.println("Address is -->"+ll.getAddress());
			}
			else
			{
				throw new ProfileNotFoundException("Profile Not Found Exception"+email);
			}
		
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		//LinkedInUserEntity ll = new LinkedInUserEntity();
		Scanner sc = new Scanner(System.in);
		LinkedInServiceInterface ls = new LinkedInService();
		List<LinkedInUserEntity> list = ls.ViewAllProfileService();
		list.parallelStream().forEach(lm->{ // This Stream is Known as Parallel Stream
			System.out.println("******************************");
			System.out.println("Your Profile is ");
			System.out.println("Name is --->" + lm.getName());
			System.out.println("Password is --> "+lm.getPassword());
			System.out.println("Email is -->"+lm.getEmail());
			System.out.println("Address is -->"+lm.getAddress());
		});
//		list.stream().filter(s->s.getEmail()=="mahee@gmail.com").map(p->p.getName()).forEach((System.out::println)); //for the sequential Stream
		System.out.println("press 1 to sort by name : ");
		System.out.println("press 2 to sort by email : ");
		System.out.println("press 3 to sort by address : ");
		System.out.println("Enter the input  : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:Collections.sort(list,new SortbyName());
		for(LinkedInUserEntity lm:list)
		{
			System.out.println("*********Sorted based on NAME**********");
			System.out.println("Your Profile is ");
			System.out.println("Name is --->" + lm.getName());
			System.out.println("Password is --> "+lm.getPassword());
			System.out.println("Email is -->"+lm.getEmail());
			System.out.println("Address is -->"+lm.getAddress());
		}
			break;
			
		case 2:Collections.sort(list,new SortbyEmail());
		for(LinkedInUserEntity lm:list)
		{
			System.out.println("*********Sorted based on Email**********");
			System.out.println("Your Profile is ");
			System.out.println("Name is --->" + lm.getName());
			System.out.println("Password is --> "+lm.getPassword());
			System.out.println("Email is -->"+lm.getEmail());
			System.out.println("Address is -->"+lm.getAddress());
		}
			break;
			
		case 3 : Collections.sort(list,new SortbyAddress());
		for(LinkedInUserEntity lm:list)
		{
			System.out.println("*********Sorted based on Address**********");
			System.out.println("Your Profile is ");
			System.out.println("Name is --->" + lm.getName());
			System.out.println("Password is --> "+lm.getPassword());
			System.out.println("Email is -->"+lm.getEmail());
			System.out.println("Address is -->"+lm.getAddress());
		}
			break;
		}
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email to edit");
		String email=sc.next();
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setEmail(email);
		LinkedInServiceInterface ls = new LinkedInService();
		LinkedInUserEntity ll = ls.ViewProfileService(lu);
		try
		{
			if(ll!=null)
			{
				System.out.println("Your old profile is ");
				System.out.println("Name is -->"+ll.getName());
				System.out.println("Password is -->"+ll.getPassword());
				System.out.println("Email is --> "+ll.getEmail());
				System.out.println("Address is -->"+ll.getAddress());
				
				System.out.println("press 1 to change password");
				System.out.println("press 2 to change address");
				
				System.out.println("enter choice");
				int c=sc.nextInt();
				
				switch(c)
				{
				case 1:
					System.out.println("enter new Password");
					String npassword = sc.next();
					ll.setPassword(npassword);
					int i=ls.editprofileService(ll);
					if(i>0)
					{
						System.out.println("Paassword Changed");
					}
				break;
				case 2 :System.out.println("enter new address ");
		  		String naddress=sc.next();
		  		
		  			ll.setAddress(naddress);
				  int i1=ls.editprofileService(ll);
				  
				  if(i1>0) {
					  System.out.println("Address changed");
				  }
				  break;
				default : System.out.println("wrong choice");
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Email");
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setEmail(email);
		LinkedInServiceInterface ls = new LinkedInService();
		int lsu = ls.DeleteProfileService(lu);
		if(lsu>0)
		{
			System.out.println("Profile deleted");
		}
		
	}

	@Override
	public void SearchProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to view profile");
		String email=sc.next();
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setEmail(email);
		LinkedInServiceInterface ls = new LinkedInService();
		LinkedInUserEntity ll = ls.ViewProfileService(lu);
		try
		{
			if(ll!=null)
			{
				System.out.println("Your Profile is ");
				System.out.println("Name is --->" + ll.getName());
				System.out.println("Password is --> "+ll.getPassword());
				System.out.println("Email is -->"+ll.getEmail());
				System.out.println("Address is -->"+ll.getAddress());
			}
			else
			{
				throw new ProfileNotFoundException("Profile Not Found Exception"+email);
			}
		
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
		

	@Override
	public void LoginProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to view profile");
		String email=sc.next();
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setEmail(email);
		LinkedInServiceInterface ls = new LinkedInService();
		LinkedInUserEntity ll = ls.LoginProfileService(lu);
		try
		{
			if(ll!=null)
			{
				System.out.println("Your Profile is ");
				System.out.println("Name is --->" + ll.getName());
				System.out.println("Email is -->"+ll.getEmail());
				System.out.println("Address is -->"+ll.getAddress());
				System.out.println("LOGIN SUCCESS FULL");
			}
			else
			{
				throw new ProfileNotFoundException("Wrong Pasword Exception"+email);
			}
		
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}

		
	}

