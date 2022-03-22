package com.zomato.controller;

import java.util.List;

import com.zomato.userdetails;
import com.zomato.entity.ZomatoUser;

public interface ZomatoControllerinterface {

	
int editprofilecontroller();

	int deletperofilecontroller();

	ZomatoUser viewprofilecontroller();

	int searchprofilecontroller();

	

	

	List<ZomatoUser> viewallprofilecontroller();

	int signupcontroller();

	ZomatoUser signincontroller();

	void viewallsortprofilecontroller();

}