<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta author = "Laura Bullock - February 1, 2021">
<title>Hello Human</title>
</head>
<body>
	<h1>Hello <c:out value="${user}!"/></h1>
	<h4>Welcome to SpringBoot!</h4>
</body>
</html>

<!--Assignment: Hello "Human" - http://learn.codingdojo.com/m/145/6906/49945
You are tasked to build a page that will greet whoever visits your page. If they don't tell you their name, then greet them as "human".


Topics:
- Query Parameters

Tasks:
--Create an app that will render a page with either a default value of "human" or with the name provided in the URL query string.-->
