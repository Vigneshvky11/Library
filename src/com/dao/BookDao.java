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

public class BookDao {

	public static int save(BookBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?,?,?)");
			ps.setString(1,bean.getIsbnno());
			ps.setString(2,bean.getAuthor());
			ps.setString(3,bean.getAuthor());
			ps.setString(4,bean.getPublisher());
			ps.setInt(5,bean.getQuantity());
			ps.setInt(6,0);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static List<BookBean> view(){
		List<BookBean> list=new ArrayList<BookBean>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from book");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BookBean bean=new BookBean();
				bean.setIsbnno(rs.getString("isbnNumber"));
				bean.setAuthor(rs.getString("name"));
				bean.setAuthor(rs.getString("author"));
				bean.setPublisher(rs.getString("publisher"));
				bean.setQuantity(rs.getInt("quantity"));
				bean.setIssued(rs.getInt("issued"));
				
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
			PreparedStatement ps=con.prepareStatement("delete from book where isbnNumber=?");
			ps.setString(1,isbnNo);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static int getIssued(String isbnNo){
		int issued=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from book where isbnNumber=?");
			ps.setString(1,isbnNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				issued=rs.getInt("issued");
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return issued;
	}
}
