<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
                               <h2>Passengers Details</h2>
	
	
	
	                        <table border="1">  	
					      
							<tr>
							<TD>Name: <%=request.getParameter("name")%></TD>
							</tr>
							
						
							<tr>
							<TD>Age: <%= request.getParameter("age")%></TD>
							</tr>
						
						
							<tr>
							<TD>Email: <%=request.getParameter("email")%></TD>
							</tr>
						
						
							<tr>
							<TD>Phone: <%= request.getParameter("phn")%></TD>
							</tr>

						
	                      </table>
     

	<h2>Search Flights</h2>
        <form action="findFlight" method="get">
        <tr>
        <td>From:<input type="text" name="from"></td>
        <td>To:<input type="text" name="to"></td>
             <input type="submit" value ="Search Flights">      
        </tr>
      </form>   
        
   


</body>
</html>