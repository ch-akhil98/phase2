package com.flight.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Confirm")
public class ConfirmFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ConfirmFlight() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String card = request.getParameter("card");
		String name= request.getParameter("cardname");
		String cvv = request.getParameter("cvv");
		String expiry = request.getParameter("expiry");
		
		request.setAttribute(card, "card");
		request.setAttribute(name, "name");
		request.setAttribute(cvv, "cvv");
		request.setAttribute(expiry, "expiry");
	    request.getRequestDispatcher("ConfirmReservation.jsp").include(request, response);
		
	}

}
