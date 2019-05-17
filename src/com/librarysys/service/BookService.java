package com.librarysys.service;

import java.util.List;

import com.librarysys.model.Book;



public interface BookService {
	public abstract void  addBook(Book book);
	public abstract Book fetchBook(int bookId);
	public abstract Integer deleteAuthor(int bookId);
	public abstract Book updateClassificationById(int bookId, Book book);
	public abstract List<Book>getAllBook();
}
