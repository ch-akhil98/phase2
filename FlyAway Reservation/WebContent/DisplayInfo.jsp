<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head> <h2 style="color:maroon">Reservation Details</h2>
<body> <%
   
				try {
					String FlightId = request.getParameter("FlightId");
					String connectionURL = "jdbc:mysql://localhost:3306/localhost";
					Connection connection = null;
					Statement statement = null;
					ResultSet rs = null;
					request.getParameter("FlightId");
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights", "root", "root");
					statement = connection.createStatement();
					String Query = ("SELECT * from Airlines where id='"+FlightId+"'");
					rs = statement.executeQuery(Query);
						
							if(rs.next()==true){ %>
							<table style="table-layout: fixed" border="1">  	
					      
							<tr>
							<TD>FlightId: <%= rs.getString(1)%></TD>
							</tr>
						         
							<tr>
							<TD>OPERATING AIRLINES: <%= rs.getString(2)%></TD>
							</tr>
						
						
							<tr>
							<TD>DEPARTURE CITY: <%= rs.getString(3)%></TD>
							</tr>
						
						
							<tr>
							<TD>ARRIVAL CITY: <%= rs.getString(4)%></TD>
							</tr>

						
							<tr>
							<TD>DATE OF TRAVEL: <%= rs.getString(5)%></TD>
							</tr>
					 <form action="Confirm" method="post">
                    </table align="left">

					                <h2>Enter your Card Details</h2>
	<pre>
     Card Number:<input type="number" name="card">
Name on the card:<input type="text" name="cardname">
             CVV:<input type="password" name="cvv">
     Expiry Date:<input type="date" name="expiry">
		   <input type="submit" value="Pay Now">
</pre>
	</form>				
					<%	}else %><% 	out.print("Enter the Correct Id"); %>
			                  
		<% 	rs.close();
		statement.close();
		connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
         %>
<%
}
%>

		      
</body>
</html>