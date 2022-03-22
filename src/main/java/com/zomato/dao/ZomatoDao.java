package com.zomato.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zomato.entity.ZomatoUser;


public class ZomatoDao implements ZomatoDAOinterface {
	Connection con =null;
	public ZomatoDao() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","oracle");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			}}
		
	

	public int deleteprofileDAO(ZomatoUser zu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("delete from ZomatoUser where email=?");
			
			
			ps.setString(1, zu.getEmail());
			
			 
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return i;
	
	}

	

	public ZomatoUser viewprofileDAO(ZomatoUser zu) {
		ZomatoUser s1=null;
		try{
			PreparedStatement ps=con.prepareStatement("select * from ZomatoUser where email=?");
			ps.setString(1, zu.getEmail());
			
		    ResultSet res=ps.executeQuery();
		    if(res.next()) {
			String n=res.getString(1);
			 int s=   res.getInt(2);
			String p=res.getString(3);
			String e=res.getString(4);
			String a=res.getString(5);
			s1=new ZomatoUser();
			s1.setName(n);
			s1.setAge(s);
			s1.setPassword(p);
			s1.setEmail(e);
			s1.setAddress(a);
		  
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return s1;
		
	}

	public int searchprofileDAO(ZomatoUser zu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("select * from ZomatoUser where name=?");
			
			
			ps.setString(1, zu.getName());
			 
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return i;
	}

	public int editprofileDAO(ZomatoUser zu, ZomatoUser zu1) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("Update ZomatoUser set name = ?, age = ?  where email=?");
			
			ps.setString(1, zu1.getName());
			ps.setInt(2, zu1.getAge());
			ps.setString(3, zu.getEmail());
			 
			i=ps.executeUpdate();
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return i;
	}

	
	

	@Override
	public List<ZomatoUser> viewallprofileDAO() {
		List<ZomatoUser>  ll=new ArrayList<ZomatoUser>();
		try{
			PreparedStatement ps=con.prepareStatement("select * from ZomatoUser ");
			
			
		    ResultSet res=ps.executeQuery();
		    while(res.next()) {
			String n=res.getString(1);
			 int s=   res.getInt(2);
			String p=res.getString(3);
			String e=res.getString(4);
			String a=res.getString(5);
			ZomatoUser s1=new ZomatoUser();
			s1.setName(n);
			s1.setAge(s);
			s1.setPassword(p);
			s1.setEmail(e);
			s1.setAddress(a);
			ll.add(s1);
		  
			
			
					
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return ll;
	}

	@Override
	public ZomatoUser signinDAO(ZomatoUser zu) {
		ZomatoUser data = null;
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from userdetails where email=?");
			
			ps.setString(1, zu.getEmail());
			
			ResultSet s1 =ps.executeQuery();
			if(s1.next()){
				
				String p=s1.getString(2);
				String e=s1.getString(3);
				
				
				data=new ZomatoUser();
				
				data.setPassword(p);
				data.setEmail(e);
				
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}


	public int signupDAO(ZomatoUser zu) {
		int i=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into ZomatoUser values(?,?,?,?,?)");
			
			ps.setString(1, zu.getName());
			ps.setInt   (2,zu.getAge());
			ps.setString(3, zu.getPassword());
			ps.setString(4, zu.getEmail());
			ps.setString(5, zu.getAddress());
			 
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		return i;
	}
	
}
