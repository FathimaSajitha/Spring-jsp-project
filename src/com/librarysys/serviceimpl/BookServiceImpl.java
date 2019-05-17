package com.librarysys.serviceimpl;

import java.util.List;

import com.librarysys.dao.BookDao;
import com.librarysys.model.Book;
import com.librarysys.service.BookService;

public class BookServiceImpl implements BookService{
	
	
	private BookDao bookDao;
	
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void addBook(Book book) {
		bookDao.createBook(book);
		
	}

	@Override
	public Book fetchBook(int bookId) {
		return bookDao.fetchBookById(bookId);
	}

	@Override
	public Integer deleteAuthor(int bookId) {
		return bookDao.deleteBookById(bookId) ;
	}

	@Override
	public Book updateClassificationById(int bookId, Book book) {
		return null ;
	}

	@Override
	public List<Book> getAllBook() {
		return bookDao.getAllBook() ;
	}

}
