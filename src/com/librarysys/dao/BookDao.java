package com.librarysys.dao;


import java.util.List;

import com.librarysys.model.Book;



public interface BookDao {
	public abstract void  createBook(Book book);
	public abstract Book fetchBookById(int bookId);
	public abstract Integer deleteBookById(int bookId);
	public abstract void updateBookById(String newbookName ,int bookId);
	public abstract List<Book>getAllBook();
}


