package com.zomato;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zomato.controller.ZomatoController;
import com.zomato.controller.ZomatoControllerinterface;
import com.zomato.entity.ZomatoUser;

public class ControllerTest {
	ZomatoControllerinterface zc=null;

	@Before
	public void setUp() throws Exception {
		zc=new ZomatoController();
	}

	@After
	public void tearDown() throws Exception {
		zc=null;
	}

	@Test
	public void testEditprofilecontroller() {
		int i=zc.editprofilecontroller();
		assert i>0:"test case fail to edit profile";
	}

	@Test
	public void testDeletperofilecontroller() {
		int i=zc.deletperofilecontroller();
		assert i>0:"test case fail to delete profile";
	}

	@Test
	public void testViewprofilecontroller() {
		ZomatoUser i=zc.viewprofilecontroller();
		assert (i!=null):"test case fail to view profile";
	}

	@Test
	public void testSearchprofilecontroller() {
		int i=zc.searchprofilecontroller();
		assert i>0:"test case fail to search profile";
	}

	@Test
	public void testViewallprofilecontroller() {
		List<ZomatoUser> i=zc.viewallprofilecontroller();
		assert i!=null:"test case fail to viewall profile";
	}

	@Test
	public void testSignupcontroller() {
		int i=zc.signupcontroller(); 
		assert i>0:"test case fail to signup profile";
	}

	@Test
	public void testSignincontroller() {
		ZomatoUser i=zc.signincontroller();
		assert i!=null:"test case fail to signin profile";
	}

	@Test
	public void testViewallsortprofilecontroller() {
		List<ZomatoUser> i=zc.viewallprofilecontroller();
		assert i!=null:"test case fail toview allsorted  profile";
	}

}
