package com.flight.controller;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.dao.FlightDao;
import com.flight.dao.FlightDaoimpl;




@WebServlet("/findFlight")
public class Findflights extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
       
   
    public Findflights() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String from = request.getParameter("from");
		String to = request.getParameter("to");
	     RequestDispatcher rd = request.getRequestDispatcher("FlightList.jsp");
	     rd.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		new FlightDaoimpl();
		
		
	}

}
