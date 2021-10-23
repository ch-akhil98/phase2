package com.flight.dao;


public interface FlightDao {


	public void connectDB();

	public boolean verifyLoginCredentials(String name, String pass);

	public String newRegistration(String name , String age , String email , String phone);

	public String updatePass(String Username ,String password);

	
}
