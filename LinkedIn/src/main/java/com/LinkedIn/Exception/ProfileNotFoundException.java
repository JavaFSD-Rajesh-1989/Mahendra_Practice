package com.LinkedIn.Exception;

public class ProfileNotFoundException extends Exception {
	String Password;
	String message;
	public ProfileNotFoundException(String message)
	{
		this.message = message;
	}
	public String toString()
	{
		return " Iam an User defined Exception"+message;
	}
	
}
