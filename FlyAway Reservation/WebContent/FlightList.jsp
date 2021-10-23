<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book here</title>
</head>
<body>
                     <h1 style="align-content: center">List Of Flights</h1>                                <h3 style ="color:purple">Enter the flightId to book Flight</h3>
                     <form action="Reservation" method="get">                  <input type="text" name="FlightId"><input type="submit" value="BOOK HERE">
	<table style="table-layout: fixed"> <br></br>                                               
			<table border="1">
			<tr style="background-color: green; color: aliceblue ; font-weight: bold;">
				<td>FlightId</td>
				<td>Operating_Airlines</td>
				<td>Depart_city</td>
				<td>Arrival_city</td>
				<td>Departure_date</td>
				     <td>Fare</td>
				</tr>
			</table>
			         </form>
			<%
				try {
					String from = request.getParameter("from");
					String to = request.getParameter("to");
					
				
					Connection connection = null;
					Statement statement = null;
					ResultSet rs = null;
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights", "root", "root");
					statement = connection.createStatement();
					String Query = "Select * from airlines where departure_city ='"+from+"' and arrival_city ='"+to+"' ";
					rs = statement.executeQuery(Query);
			 %> 
			<%while (rs.next()) { %> 
				
				
				 
               <TABLE style="table-layout: fixed" border="1"> 
				<TR>
					<TD><%=rs.getString(1)%></TD>
					<TD><%=rs.getString(2)%></TD>
					<TD><%=rs.getString(3)%></TD>
					<TD><%=rs.getString(4)%></TD>
					<TD><%=rs.getString(5)%></TD>
					<TD><%=rs.getString(6)%></TD>
				</TR>
		       	<% } %>

				<%
					rs.close();
						statement.close();
						connection.close();
				%>
<% }catch (Exception e) {
out.println("No Flights Available");
}

%>

  	
			   
</body>
</html>