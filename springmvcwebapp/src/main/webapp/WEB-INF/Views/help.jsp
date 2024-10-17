<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page</h1>
	<% 
		String name = (String)request.getAttribute("name");
		LocalDateTime now = (LocalDateTime)request.getAttribute("now");
	%>
	<h1>My name is <%= name %></h1>
	<h1>Today is <%= now %></h1>
</body>
</html>