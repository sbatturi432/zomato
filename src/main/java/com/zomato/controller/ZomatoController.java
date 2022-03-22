package com.zomato.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import com.zomato.entity.ZomatoUser;
import com.zomato.service.ZomatoServiceinterface;

import com.zomato.user.Zomatouser;
import com.zomato.utility.ServiceFactory;

public class ZomatoController implements ZomatoControllerinterface {
	Scanner sc=new Scanner(System.in);

	

	public int editprofilecontroller() {
		
		System.out.println("enter your email that you want to edit ");
		String email=sc.next();
		
		ZomatoUser zu=new ZomatoUser();
		zu.setEmail(email);
		
		
		System.out.println("Enter your name");
		
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
	    ZomatoUser zu1=new ZomatoUser();
		zu1.setName(name);
		zu1.setAge(age);
		
		
		
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		int i=zs.editprofileservice(zu,zu1);
		
		
		
		
		if(i>0) {
			System.out.println("profile edited");
		}
		else {
			System.out.println("profile not edited");
		}
		return i;
		
	}
	

	public int deletperofilecontroller()  {
		System.out.println("enter your email that you want to delete");
		String email=sc.next();
		
		
		
		ZomatoUser zu=new ZomatoUser();
		zu.setEmail(email);
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		int i=zs.deleteprofileservice(zu);
		if(i>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("profile not deleted ");
		}
		return i;
		
		
	}

	public ZomatoUser viewprofilecontroller() {
		
		System.out.println("enter your email that you want to view");
		String email=sc.next();
		
		ZomatoUser zu=new ZomatoUser();
		zu.setEmail(email);
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		ZomatoUser user=zs.viewprofileservice(zu);
		if(user !=null) {
			System.out.println("name is "+user.getName());
			System.out.println("age is "+user.getAge());
			System.out.println("password is "+user.getPassword());
			System.out.println("email is "+user.getEmail());
			System.out.println("address is "+user.getAddress());
		}
		return user;
	}

	public int searchprofilecontroller() {
		System.out.println(" enter your name that you want to search");
		String name=sc.next();
		ZomatoUser zu=new ZomatoUser();
		zu.setName(name);
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		
		int i=zs.searchprofileservice(zu);
		if(i>0) {
			System.out.println("search profile found");
		}
		else {
			System.out.println("search profile not found");
		}
		return i;
	}



	public List<ZomatoUser> viewallprofilecontroller() {
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		
		List<ZomatoUser> ll=new ArrayList<ZomatoUser>();    
		
		ll=zs.viewallprofileservice();
		
		ll.forEach( j -> {
			System.out.println("name is   "+j.getName());
			System.out.println("age is    "+ j.getAge());
			System.out.println("password is    "+ j.getPassword());
			System.out.println("email is    "+ j.getEmail());
			System.out.println("address is    "+ j.getAddress());});
		
		return ll;
		
		
					
}

	@Override
	public int signupcontroller() {
		System.out.println(" enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your password");
		String password=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		
		ZomatoUser zu=new ZomatoUser();
		zu.setName(name);
		zu.setAge(age);
		zu.setPassword(password);
		zu.setEmail(email);
		zu.setAddress(address);
		
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		int i=zs.signupservice(zu);
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("profile not created");
		}
		return i;
	}

	@Override
	public ZomatoUser signincontroller() {
		System.out.println("enter your email");
		String email=sc.next();
		
		System.out.println("enter your password");
		String password=sc.next();
		ZomatoUser zu=new ZomatoUser();
		zu.setPassword(password);
		zu.setEmail(email);
		
        ZomatoServiceinterface zs=ServiceFactory.createobject();
		ZomatoUser s1=zs.viewprofileservice(zu);
		
		return s1;
	}

	@Override
	public void viewallsortprofilecontroller() {
		ZomatoServiceinterface zs=ServiceFactory.createobject();
		
		List<ZomatoUser> ll=new ArrayList<ZomatoUser>();    

		System.out.println("after sorting by name");
		ll=zs.viewallprofileservice();
		Collections.sort(ll,new SortbyName());
		ll.forEach(s ->{
			System.out.println(s.getName());
			System.out.println(s.getPassword());
		    System.out.println(s.getEmail());
			System.out.println(s.getAddress());});
		
		
	}}
