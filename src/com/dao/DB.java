package com.dao;

import java.sql.*;
import java.util.Properties;

public class DB {
public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("org.postgresql.Driver");
			String url ="jdbc:postgresql://127.0.0.1:8081/library_management";
			Properties prop =  new Properties();
			prop.setProperty("user", "postgres");
			prop.setProperty("password", "postgres");
			con=DriverManager.getConnection(url,prop);
			
		}catch(Exception e){
			 e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
			
		}
		
	return con;
}
}
