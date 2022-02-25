package com.ac.Ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ac.bean.Book;
import com.ac.service.BookService;

public class BookUI {
	public static void main(String[] args) throws Exception   
	{	int bookId=0;
		String booktitle="";
		float bookprice=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice=s.nextInt();
		
		switch(choice)
	{
		
		case 1:
			//for adding book Details
			
		    System.out.println("Enter Book Id");
			bookId = s.nextInt();
			s.nextLine();
			System.out.println("Enter Book Titile");
			booktitle = s.nextLine();
			
			System.out.println("Enter Book price");
			
			bookprice = s.nextFloat();
			s.nextLine();
			BookService bookService = new BookService(); 
			int updateCount = bookService.addBookService(bookId, booktitle, bookprice); 
	 
			System.out.println("inserted "+updateCount+" record   Success");
			break;
			
		case 2:
			//for getting book detail
			
			BookService bookService1 = new BookService(); 
			System.out.print("Enter id to get book detail");
			int id=s.nextInt();
			ArrayList<Book> arr=bookService1.getBookService(id);
			System.out.println(arr);
			break;
			
		default:
			System.out.println("Wrong choice...Please Enter Correct Input");
			break;
	} 
	}
}
