package com.LinkedIn.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.LinkedIn.Entity.LinkedInUserEntity;

public class LinkedIndaoTest {

	private LinkedInDaoInterface idao;
	@Before
	public void setUp() throws Exception {
		idao=new LinkedIndao();
	}

	@After
	public void tearDown() throws Exception {
		idao =  null;
	}

	@Test
	public void testCreateProfileDao() {
//		fail("Not yet implemented");
		LinkedInUserEntity lu = new LinkedInUserEntity();
		lu.setName("Krishna");
		lu.setPassword("Krishna");
		lu.setEmail("mahendrakrishna@gmail.com");
		lu.setAddress("pileru");
		
		int i = idao.CreateProfileDao(lu);
		assert i>0 : "could not create profile"; // it is just like if - else loop
	}

	@Test
	public void testViewProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoginProfileDao() {
		fail("Not yet implemented");
	}

}
