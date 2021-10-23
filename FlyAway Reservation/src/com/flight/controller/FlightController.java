package com.flight.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.dao.FlightDao;
import com.flight.dao.FlightDaoimpl;




@WebServlet("/login")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FlightController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		FlightDao fd = new FlightDaoimpl();
		fd.connectDB();
	   boolean result =	fd.verifyLoginCredentials(name,pass);
		if(result==true) {
		    System.out.println("Login Successful");
		   RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
		   rd.forward(request, response);
			
		}else {
			PrintWriter out = response.getWriter();
			out.println("Invalid Username or Password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			   rd.include(request, response);
		}
		
			
		} 
		
				
		
	}


