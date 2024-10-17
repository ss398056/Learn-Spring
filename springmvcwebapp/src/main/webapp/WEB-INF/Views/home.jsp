<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>This is /home url</h1>
	<br>
	<br>
	
	
<!-- 	//Traditional way to get data from request -->
	<h1>*********This is Traditional way to get data from request*********</h1>
	<%
		String sname = (String)request.getAttribute("name");
		Integer sid = (Integer)request.getAttribute("id");
		List<String> sfriends = (List<String>)request.getAttribute("friends");
	%>
	<h1>My name is <%= sid %> <%= sname %></h1>
	<h1>My Friends</h1>
	<% for(String s : sfriends){ %>
		<h2><%= s %></h2>
	<% } %>
	
	
	<br>
	<br>
	
<!-- 	Shortcut way to get data from request by jsp expression lanuage -->
	<h1>**************This is shortcut way to get data from request by jsp expression lanuage****************</h1>
	<h1>My name is ${name }</h1>
	<h1>My id is ${id }</h1>
	<h1>My friends are ${friends }</h1>
	<c:forEach var="item" items="${friends}">
		<h2>${item }</h2>
	</c:forEach>
	
	<h1>End</h1>
		
</body>
</html>