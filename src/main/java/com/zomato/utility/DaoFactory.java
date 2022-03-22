package com.zomato.utility;

import com.zomato.dao.ZomatoDAOinterface;
import com.zomato.dao.ZomatoDao;

public class DaoFactory {

	public static ZomatoDAOinterface createobject() {
		// TODO Auto-generated method stub
		return new ZomatoDao();
	}

}
