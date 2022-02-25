package com.ac.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB {
	public static Connection getConnection() 
			  throws Exception
			  {
				  
			
				  
				
				 String driverName = "org.postgresql.Driver";
				 //loading driver class 
				  Class.forName(driverName);
				  //creating connection
				  Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/bookdb","postgres","A@yush303"+  "");
				
				return conn; 
			  }
}
