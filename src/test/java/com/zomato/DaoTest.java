package com.zomato;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zomato.dao.ZomatoDAOinterface;
import com.zomato.dao.ZomatoDao;
import com.zomato.entity.ZomatoUser;

public class DaoTest {
	ZomatoDAOinterface zd=null;
	ZomatoUser zu=new ZomatoUser();
	ZomatoUser zu1=new ZomatoUser();

	@Before
	public void setUp() throws Exception {
		zd=new ZomatoDao();
	}

	@After
	public void tearDown() throws Exception {
		zd=null;
	}	
	@Test
	public void testDeleteprofileDAO() {
		zu.setEmail("ekshu@gmail.com");
		int i=zd.deleteprofileDAO(zu);
		assert i>0:"test case fail to delete profile";
	}

	@Test
	public void testViewprofileDAO() {
		zu.setEmail("ekshu@gmail.com");
		
		 ZomatoUser ll=zd.viewprofileDAO(zu);
		 assert ll!=null:"test case fail to view profile";
	}

	@Test
	public void testSearchprofileDAO() {
		zu.setName("durga");
		int i=zd.searchprofileDAO(zu);
		assert i>0:"test case fail to search profile";
	}

	@Test
	public void testEditprofileDAO() {
		zu.setEmail("durga@gmail.com");
		int i=zd.editprofileDAO(zu,zu1);
		assert i>0:"test case fail to edit profile";
	}

	@Test
	public void testViewallprofileDAO() {
		 List<ZomatoUser> ll= zd.viewallprofileDAO();
		assert ll!=null:"test case fail to viewall profile";
	}

	@Test
	public void testSigninDAO() {
		zu.setEmail("durga@gmail.com");
		zu.setPassword("ekekk");
		ZomatoUser zl=zd.signinDAO(zu);
		assert zl!=null:"test case fail to signin profile";
	}

	@Test
	public void testSignupDAO() {
		
		int i=zd.signupDAO(zu);
		assert i>0:"test case fail to signup profile";
	}

}
