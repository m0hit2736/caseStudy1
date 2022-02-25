package com.ac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class BookDao implements bookDaoInterface {
	
	
	 public int addBook(Book book) //adding book detail into table
	  {	 
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  try
		  {  
			  con=BookDB.getConnection();
			  
			  String ins_str = "insert into books values(?,?,?,?)";
			 
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,book.getBookId());
			  pstmt.setString(2,book.getBooktitle());
			  pstmt.setFloat(3,book.getBookprice());
			  pstmt.setString(4,book.getBookgrade());
			  int updateCount = pstmt.executeUpdate();  
			     
			  con.close();
			  return updateCount; 
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	  }
	 
	 
	  public ArrayList getBookDetailsById(int bookId) //returning book details from table
				throws Exception
				{
					Connection con = null;
					PreparedStatement pstmt = null;
					ResultSet rs = null;
					
					con = BookDB.getConnection();
					
			    String sel_str ="Select booktitle,bookprice from books where bookId=?";
					  
					  
					  pstmt = con.prepareStatement(sel_str);
					  pstmt.setInt(1,bookId);
					  rs = pstmt.executeQuery();
					  
					  ArrayList result = new ArrayList();
					  if(rs.next())
					  {
						  result.add(rs.getString(1));
						  result.add(rs.getString(2));
						  
					  }
					  else
					  {
						  result.add("Invalid Id");
					  }
					  return result;
					
				}
}


