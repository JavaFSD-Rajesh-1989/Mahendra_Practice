package com.LinkedIn.View;

import java.util.Scanner;
import java.util.logging.Logger;

import com.LinkedIn.Controller.LinkedInController;
import com.LinkedIn.Controller.LinkedInControllerInterface;
import com.LinkedIn.utility.LinkedInControllerFactory;

public class LinkedInView {

	public static void main(String[] args) {
		String ss="y";
		while(ss.equals("y"))
		{
		System.err.println("*********Main Menu*******");
		System.out.println("Press 1 to Create Profile");
		System.out.println("Press 2 to View Profile");
		System.out.println("Press 3 to view all profile");
		System.out.println("Press 4 to Edit profile");
		System.out.println("Press 5 to Delete profile");
		System.out.println("Press 6 to Search Profile");
		System.out.println("Press 7 to Login Profile");
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the option");
		int input = sc.nextInt();
		
		LinkedInControllerInterface li = LinkedInControllerFactory.createObject("user");
		switch(input)
		{
		case 1 : li.createProfileController();
			break;
		case 2 : li.viewProfileController();
			break;
		case 3 : li.viewAllProfileController();
			break;
		case 4 : li.editProfileController();
		break;
		case 5 : li.deleteProfileController();
		break;
		case 6 : li.SearchProfileController();
		break;
		case 7: li.LoginProfileController();
		break;
		default:
			System.out.println("WRONG OPTION ");
		}
		System.out.println("Press Y to continue");
		ss= sc.next();
	}
}
}