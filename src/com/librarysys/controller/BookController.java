package com.librarysys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarysys.model.Book;
import com.librarysys.service.BookService;

@WebServlet("/BookController")
public class BookController  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
		
	public BookController() {
	       super();
		 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer bookId= Integer.parseInt(request.getParameter(""));
		String bookName = request.getParameter("");;
		String date = request.getParameter("");
		String subClassificationId = request.getParameter("");

		 ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml");
		 BookService bookService=context.getBean("bookService",BookServiceImpl.class);
		 
		 Book book = new Book();
		 book.setBookId(bookId);
		 book.setAuthor_name(author_name);		 
		 bookService.addAuthor(author);
		 
		 System.out.println(author_name);
		 
		 doGet(request,response);
	}

}
