package com.librarysys.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarysys.model.Author;
import com.librarysys.model.Classification;
import com.librarysys.service.AuthorService;
import com.librarysys.service.ClassificationService;

public class Test {
	 public static void main(String args[]) {
		 ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml"); 
//		 ClassificationService classificationService=context.getBean("classificationService",ClassificationService.class);
//		 Classification classification = new Classification();
//		 classification.setClassificationId(1);
//		 classification.setClassificationName("maths");		 
//		 classificationService.addClassification(classification);

//		 		 for(Classification classification:classificationService.getAllClassifications()) {
//			 System.out.println(classification.getClassificationId()+""+classification.getClassificationName());
//		 }
		 
		
//		 AuthorService authorService=context.getBean("authorService",AuthorService.class);
//		 Author author = new Author();
//		 author.setAuthor_Id(55);
//		 author.setAuthor_name("gggg");		 
//		 authorService.addAuthor(author);
	 }

}
