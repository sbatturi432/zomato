package com.zomato.service;

import java.util.List;

import com.zomato.userdetails;
import com.zomato.dao.ZomatoDAOinterface;
import com.zomato.entity.ZomatoUser;

import com.zomato.utility.DaoFactory;

public class ZomatoService implements ZomatoServiceinterface {
	
	ZomatoDAOinterface zd=DaoFactory.createobject();
	

	

	public int deleteprofileservice(ZomatoUser zu) {
		return zd.deleteprofileDAO(zu);
	}

	
public ZomatoUser viewprofileservice(ZomatoUser zu) {
		return zd.viewprofileDAO(zu);
	}

	public int searchprofileservice(ZomatoUser zu) {
		return zd.searchprofileDAO(zu);
	}

	public int editprofileservice(ZomatoUser zu, ZomatoUser zu1) {
		
		return zd.editprofileDAO(zu,zu1);
	}
	
	@Override
	public List<ZomatoUser> viewallprofileservice() {
		return zd.viewallprofileDAO();
	}

	@Override
	public ZomatoUser signinservice(ZomatoUser zu) {
		
		return zd.signinDAO(zu);
	}

	@Override
	public int signupservice(ZomatoUser zu) {
		
		return  zd.signupDAO(zu);
	}

	

	

	

}
