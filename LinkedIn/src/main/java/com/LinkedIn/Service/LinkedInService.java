package com.LinkedIn.Service;

import java.util.List;

import com.LinkedIn.Entity.LinkedInUserEntity;
import com.LinkedIn.dao.LinkedInDaoInterface;
import com.LinkedIn.dao.LinkedIndao;

public class LinkedInService implements LinkedInServiceInterface {

	@Override
	public int CreateProfileService(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.CreateProfileDao(lu);
	}

	@Override
	public LinkedInUserEntity ViewProfileService(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.ViewProfileDao(lu);
	}

	@Override
	public List<LinkedInUserEntity> ViewAllProfileService() {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.ViewAllProfileDao();
	}

	@Override
	public int editprofileService(LinkedInUserEntity ll) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld=new LinkedIndao();
		return ld.EditProfileDao(ll);
	}

	@Override
	public int DeleteProfileService(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.DeleteProfileDao(lu);
	}

	@Override
	public LinkedInUserEntity SearchProfileService(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.SearchProfileDao(lu);
	}

	@Override
	public LinkedInUserEntity LoginProfileService(LinkedInUserEntity lu) {
		// TODO Auto-generated method stub
		LinkedInDaoInterface ld = new LinkedIndao();
		return ld.LoginProfileDao(lu);
	}

}
