package com.zomato.utility;

import com.zomato.controller.ZomatoController;
import com.zomato.controller.ZomatoControllerinterface;

public class ControllerFactory {

	public static ZomatoControllerinterface createobject() {
		// TODO Auto-generated method stub
		return new ZomatoController();
	}

}
