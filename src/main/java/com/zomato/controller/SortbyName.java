package com.zomato.controller;

import java.util.Comparator;

import com.zomato.entity.ZomatoUser;

public  class SortbyName implements Comparator<ZomatoUser> {

	public int compare(ZomatoUser u1, ZomatoUser u2) {
		
		return u1.getName().compareTo(u2.getName()) ;
	}

}
	
