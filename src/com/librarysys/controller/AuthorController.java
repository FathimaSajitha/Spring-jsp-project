package com.librarysys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarysys.model.Author;
import com.librarysys.service.AuthorService;
import com.librarysys.serviceimpl.AuthorServiceImpl;


@WebServlet("/AuthorController")
public class AuthorController  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AuthorController() {
	       super();
		 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Integer author_Id= Integer.parseInt(request.getParameter("author_id"));
		String author_name = request.getParameter("author_name");

		 ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml");
		 AuthorService authorService=context.getBean("authorService",AuthorServiceImpl.class);
		 
		 Author author = new Author();
		 author.setAuthor_Id(author_Id);
		 author.setAuthor_name(author_name);		 
		 authorService.addAuthor(author);
		 
		 System.out.println(author_name);
		 
		 doGet(request,response);
	}
}
