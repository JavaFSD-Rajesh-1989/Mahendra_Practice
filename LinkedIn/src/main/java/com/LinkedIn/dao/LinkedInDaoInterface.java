package com.LinkedIn.dao;

import java.util.List;

import com.LinkedIn.Entity.LinkedInUserEntity;

public interface LinkedInDaoInterface {

	int CreateProfileDao(LinkedInUserEntity lu);

	LinkedInUserEntity ViewProfileDao(LinkedInUserEntity lu);

	List<LinkedInUserEntity> ViewAllProfileDao();

	int EditProfileDao(LinkedInUserEntity ll);

	int DeleteProfileDao(LinkedInUserEntity lu);

	LinkedInUserEntity SearchProfileDao(LinkedInUserEntity lu);

	LinkedInUserEntity LoginProfileDao(LinkedInUserEntity lu);

	

}
