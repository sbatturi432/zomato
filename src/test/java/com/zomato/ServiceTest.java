package com.zomato;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zomato.entity.ZomatoUser;
import com.zomato.service.ZomatoService;
import com.zomato.service.ZomatoServiceinterface;

public class ServiceTest {
	ZomatoServiceinterface zs=null;
	ZomatoUser zu=new ZomatoUser();
	ZomatoUser zu1=new ZomatoUser();
	@Before
	public void setUp() throws Exception {
		zs=new ZomatoService();
	}

	@After
	public void tearDown() throws Exception {
		zs=null;
	}

	@Test
	public void testDeleteprofileservice() {
		zu.setEmail("ganga@gmail.com");
		int i=zs.deleteprofileservice(zu);
		assert i>0:"test case fail to delete profile";
	}

	@Test
	public void testViewprofileservice() {
		zu.setEmail("ekshu@gmail.com");
	
		ZomatoUser user=zs.viewprofileservice(zu);
		assert (user !=null):"test case fail to view profile";
	}

	@Test
	public void testSearchprofileservice() {
		zu.setName("durga");
		int i=zs.searchprofileservice(zu);
		assert i> 0:"test case fail to search profile";
	}

	@Test
	public void testEditprofileservice() {
		zu.setEmail("ekshu@gmail.com");
		int i=zs.editprofileservice(zu,zu1);
		assert i> 0:"test case fail to edit profile";
	}

	@Test
	public void testViewallprofileservice() {
		List<ZomatoUser> ll=zs.viewallprofileservice();
		assert ll!=null:"test case fail to viewall profile";
	}

	@Test
	public void testSigninservice() {
		zu.setEmail("ekshu@gmail.com");
		zu.setPassword("ekekk");
		ZomatoUser s1=zs.viewprofileservice(zu);
		assert s1!=null:"test case fail to signin profile";
	}

	@Test
	public void testSignupservice() {
		
		int i=zs.signupservice(zu);
		assert i> 0:"test case fail to signup profile";
	}

}
