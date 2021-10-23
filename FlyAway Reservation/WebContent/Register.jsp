<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Register here</h2>
<form action="register" method="post">
<pre>
   Name:<input type="text" name ="name">
    Age:<input type="number" name ="age">
  Email:<input type="email" name ="email">
  Phone:<input type="text" name ="phn">  
        <input type="submit" value ="Register"/>
        
          <a href="update.jsp">Update Password</a>
     

        
       
</pre>
</form>

</body>
</html>