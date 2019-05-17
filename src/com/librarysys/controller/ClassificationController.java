package com.librarysys.controller;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarysys.model.Classification;
import com.librarysys.service.ClassificationService;


@WebServlet("/ClassificationController")
public class ClassificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public ClassificationController() {
       super();
	 }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		 ClassificationService classificationService = context.getBean("classificationService", ClassificationService.class);
		 
		 response.setContentType("application/json");
		 PrintWriter writer = response.getWriter();
		 JsonObjectBuilder rootBuilder = Json.createObjectBuilder();
		 JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		 JsonObjectBuilder planBuilder = Json.createObjectBuilder();
		 
		 for(Classification classification:classificationService.getAllClassifications()) {
			 JsonObject planJson = planBuilder.add("classification_id",classification.getClassificationId())
					 .add("classification_name", classification.getClassificationName()).build();
			 arrayBuilder.add(planJson);
		 }
		 JsonObject root = rootBuilder.add("classification", arrayBuilder).build();
		 writer.print(root);
		 writer.flush();
		 writer.close();
		 
	}
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException {
//			
		 String action = request.getParameter("action");	
			
			 ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml"); 
			 ClassificationService classificationService=context.getBean("classificationService",ClassificationService.class);
			
			 
			
			
			 if(action.equalsIgnoreCase("delete")) {
				 String cid=request.getParameter("id");
					int classifictionId = Integer.parseInt(cid);
					System.out.println(classifictionId);
					classificationService.deleteClassification(classifictionId);
				
			}
			 else if(action.equalsIgnoreCase("save")) {
				Integer classificationId= Integer.parseInt(request.getParameter("classificationId"));
				String classificationName = request.getParameter("classificationName");
				System.out.println(classificationId+classificationName);
				Classification classification = new Classification();
				classification.setClassificationId(classificationId);
				classification.setClassificationName(classificationName);
				
				classificationService.addClassification(classification);
				
			}
				
			
			
			
		}

}

