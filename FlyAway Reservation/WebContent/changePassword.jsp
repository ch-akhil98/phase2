<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
String Username=request.getParameter("name");
String pass=request.getParameter("pass");
String connurl = "jdbc:mysql://localhost:3306/flights";
Connection con=null;
int id=0;
try{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights", "root", "root");
Statement st=con.createStatement();

int i=st.executeUpdate("update login set password='"+pass+"' where Username='"+Username+"'");  %>
<%if(i>0){ %>
<p>Password changed successfully..!!</p>
<% 	}%>

	



<%
st.close();
con.close();
}

catch(Exception e){
out.println(e);
}
%>