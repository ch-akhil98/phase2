package com.flight.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FlightDaoimpl implements FlightDao {
	
	private Connection con;
	private Statement stmnt;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights","root","root");
			stmnt = con.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
     	  catch (SQLException e) {
		e.printStackTrace();
    	}
		
	}

	@Override
	public boolean verifyLoginCredentials(String name, String pass) {

		try {
		ResultSet result  =	stmnt.executeQuery("select * from login where username ='"+name+"' and password = '"+pass+"'");
		return result.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String newRegistration(String name, String age, String email, String phone) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights","root","root");
	 		stmnt = con.createStatement();
	        PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?)");
	        ps.setString(1, name);
	        ps.setString(2, age);
	        ps.setString(3, email);
	        ps.setString(4, phone);
	        ps.executeUpdate();
	        ps.close();
	        con.close();

		//	stmnt.executeUpdate("insert into registration values('"+name+"' , '"+age+"' , '"+email+"' , '"+contact+"')");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "list";
		
		
		
	}

	@Override
	public String updatePass(String Username,String password) {
		try {
			int pass = stmnt.executeUpdate("update login set password='"+password+"' where username='"+Username+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Register.jsp";
	}


		
		
	}



	
		


		
		
	



	

