package com.zomato;

import java.util.Scanner;

import com.zomato.controller.ZomatoControllerinterface;
import com.zomato.entity.ZomatoUser;
import com.zomato.utility.ControllerFactory;

public class ZomatoView {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String s1="y";
		Scanner sc=new Scanner(System.in);
		ZomatoUser zu;
		ZomatoControllerinterface zc=ControllerFactory.createobject();
		while(s1.equals("y")) {
			System.out.println("******Main menu************");
			System.out.println("press 1 to sign up");
			System.out.println("press 2 to sign in");
			
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			
			
			switch(ch) {
			case 1:zc.signupcontroller();
			     break;
			case 2:zu=zc.signincontroller();
			     if(zu!=null) {
			         String s2="y";
			    	 while(s2.equals("y"))
			    		 
			    	 {
                         System.out.println("         press 1 to edit profile");
		                 System.out.println("         press 2 to delete profile");
		                 System.out.println("         press 3 to view profile ");
                         System.out.println("         press 4 to search profile");
                         System.out.println("         press 5 to viewall profile");
                         System.out.println("         press 6 to viewall by sorting addresss");
                         
                         System.out.println("enter your choice");
                 
                         int i=sc.nextInt();
           
			          switch(i) {
			        
			
			         
			         case 1:zc.editprofilecontroller();
				       break;
			         case 2:zc.deletperofilecontroller();
				       break;
			         case 3:zc.viewprofilecontroller();
				       break;
			         case 4:zc.searchprofilecontroller();
				       break;
			         case 5:zc.viewallprofilecontroller();
			           break;
			         case 6:zc.viewallsortprofilecontroller();
			           break;
			         default:System.out.println("wrong choice");
			
			} 
					
			}
			
		}
		

			}System.out.println("Do you want to continue:Y/N");
			s1=sc.next();
		}}
}