package com.ac.service;

import java.util.ArrayList;

import com.ac.bean.Book;

public interface bookServiceInterface {
	public int addBookService(int bookId, String bookTitle, float bookPrice);
	 public ArrayList<Book> getBookService(int id) throws Exception;

}
