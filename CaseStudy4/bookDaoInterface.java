package com.ac.dao;

import java.util.ArrayList;

import com.ac.bean.Book;

public interface bookDaoInterface {
	public int addBook(Book book);
	public ArrayList getBookDetailsById(int bookId) throws Exception;
}
