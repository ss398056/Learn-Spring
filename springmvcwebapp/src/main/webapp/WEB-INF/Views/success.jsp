<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1 style="color:green">${success }</h1>
	<hr>
	
	<h2>User Details</h2>
	<h3>Name : ${user.name }</h3>
	<h3>Email : ${user.email }</h3>
	<h3>Mobile No : ${user.mobile }</h3>
	<h3>Message : ${user.message }</h3>
</body>
</html>