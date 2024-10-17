package com.LinkedIn.utility;

import java.util.Comparator;

import com.LinkedIn.Entity.LinkedInUserEntity;

public class SortbyName implements Comparator<LinkedInUserEntity>{

	@Override
	public int compare(LinkedInUserEntity o1, LinkedInUserEntity o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
