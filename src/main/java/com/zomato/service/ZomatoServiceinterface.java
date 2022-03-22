package com.zomato.service;

import java.util.List;


import com.zomato.entity.ZomatoUser;


public interface ZomatoServiceinterface {

	

	int deleteprofileservice(ZomatoUser zu);

	int editprofileservice(ZomatoUser zu, ZomatoUser zu1);

	ZomatoUser viewprofileservice(ZomatoUser zu);

	int searchprofileservice(ZomatoUser zu);

	ZomatoUser signinservice(ZomatoUser zu);

	



	List<ZomatoUser> viewallprofileservice();

	int signupservice(ZomatoUser zu);

}
