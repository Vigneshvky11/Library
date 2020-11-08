package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.beans.BookBean;
import com.beans.AuthorBean;
import com.beans.UserBean;

public class AuthorDao {

	public static int save(AuthorBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into author values(?,?,?,?,?,?)");
			ps.setString(1,bean.getAuthorid());
			ps.setString(2,bean.getFirstName());
			ps.setString(3,bean.getLastName());
			ps.setString(4,bean.getAddress1());
			ps.setString(5,bean.getAddress2());
			//ps.setLong(6,getPhoneNo());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static List<BookBean> view(){
		List<BookBean> list=new ArrayList<BookBean>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from author");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BookBean bean=new BookBean();
				bean.setIsbnno(rs.getString("firstName"));
				bean.setAuthor(rs.getString("lastName"));
				bean.setPublisher(rs.getString("phoneNo"));
				
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int delete(String isbnNo){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from author where authorId=?");
			ps.setString(1,isbnNo);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
}
