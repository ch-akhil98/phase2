<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="changePassword.jsp" method="post">
<table>
    <%String Username = request.getParameter("name"); %>
    <%String password = request.getParameter("pass"); %>
    <tr><td>Enter the Username :</td><td><input type="text" name="name"></td></tr>
          <tr><td>New Password :</td><td><input type="password" name="pass"></td></tr>
<tr><td><input type="submit" value="Change Password"></td></tr>
</table>
</form>

</body>
</html>