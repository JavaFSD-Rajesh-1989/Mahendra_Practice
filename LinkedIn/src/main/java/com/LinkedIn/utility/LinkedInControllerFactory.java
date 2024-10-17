package com.LinkedIn.utility;

import com.LinkedIn.Controller.LinkedInController;
import com.LinkedIn.Controller.LinkedInControllerInterface;

public class LinkedInControllerFactory {
	private LinkedInControllerFactory() {};

	public static LinkedInControllerInterface createObject(String string) {
		// TODO Auto-generated method stub
		if(string.equals("user")) {
			return new LinkedInController();
		}
		return null;
	}

}
