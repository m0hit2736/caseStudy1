package com.ac.service;

import java.util.ArrayList;

import com.ac.bean.Book;
import com.ac.dao.BookDao;

public class BookService implements bookServiceInterface {
	
	public int addBookService(int bookId, String bookTitle, float bookPrice) {
		
		 String bookGrade="";
		 //setting grades for book according to their price
		 if(bookPrice <= 200)
		 {
			 bookGrade = "C";
		 }
		 else if(bookPrice <= 550)
		 {
			 bookGrade = "B";
		 }
		 else
		 {
			 bookGrade = "A";
		 }
		
		 BookDao bDAO = new BookDao(); 
		 Book book = new Book();
		  
		 // pass the values to put it in bean
		 
		 book.setBookId(bookId);
		 book.setBooktitle(bookTitle);
		 book.setBookprice(bookPrice);
		 book.setBookgrade(bookGrade);
		 
		 //updating table
		 int updateResult = 0;
		 try
		 {
			 updateResult = bDAO.addBook(book); 
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
		 
		
	}
	//getting detail of book
	 public ArrayList<Book> getBookService(int id) throws Exception
	 {
		 BookDao bDAO = new BookDao(); 
		ArrayList a=bDAO.getBookDetailsById(id);
		return a;
		 
	 }

}

