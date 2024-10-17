package com.LinkedIn.Service;

import java.util.List;

import com.LinkedIn.Entity.LinkedInUserEntity;

public interface LinkedInServiceInterface {

	int CreateProfileService(LinkedInUserEntity lu);

	LinkedInUserEntity ViewProfileService(LinkedInUserEntity lu);

	List<LinkedInUserEntity> ViewAllProfileService();

	int editprofileService(LinkedInUserEntity ll);

	int DeleteProfileService(LinkedInUserEntity lu);

	LinkedInUserEntity SearchProfileService(LinkedInUserEntity lu);

	LinkedInUserEntity LoginProfileService(LinkedInUserEntity lu);

}
