package com.zomato.dao;

import java.util.List;


import com.zomato.entity.ZomatoUser;


public interface ZomatoDAOinterface {

	

	int deleteprofileDAO(ZomatoUser zu);

	

	ZomatoUser viewprofileDAO(ZomatoUser zu);

	int searchprofileDAO(ZomatoUser zu);

	int editprofileDAO(ZomatoUser zu, ZomatoUser zu1);

	ZomatoUser signinDAO(ZomatoUser zu);

	

	List<ZomatoUser> viewallprofileDAO();



	int signupDAO(ZomatoUser zu);

}
