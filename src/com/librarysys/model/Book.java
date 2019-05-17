package com.librarysys.model;

public class Book {
	private int bookId;
	private String bookName;
	private String date;
	private String subClassificationId;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSubClassificationId() {
		return subClassificationId;
	}
	public void setSubClassificationId(String subClassificationId) {
		this.subClassificationId = subClassificationId;
	}
	
	

}
