package com.zomato.utility;

import com.zomato.service.ZomatoService;
import com.zomato.service.ZomatoServiceinterface;

public class ServiceFactory {

	public static ZomatoServiceinterface createobject() {
		// TODO Auto-generated method stub
		return new ZomatoService();
	}

}
