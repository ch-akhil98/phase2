package com.flight.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.dao.FlightDao;
import com.flight.dao.FlightDaoimpl;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String phone = request.getParameter("phn");
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(email);
	    System.out.println(phone);
	    HttpSession session = request.getSession();
	    
	    FlightDao fd = new FlightDaoimpl();
	       String list = fd.newRegistration(name, age, email, phone);
	       String Username = request.getParameter("name");
			String password = request.getParameter("pass");
		    
			RequestDispatcher rd = request.getRequestDispatcher("RegisterDetails.jsp");
			rd.forward(request, response);
			
           
		}
	}


