<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">

<title>Display Book</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<h1><c:out value="${book.title}" /></h1>
	
	<p>Description: <c:out value="${book.description}" /></p>
	<p>Language: <c:out value="${book.language}" /></p>
	<p>Number of pages: <c:out value="${book.numberOfPages}" /></p>
	

<a href="/books/delete/${book.id}" class="btn btn-danger">Delete This Book</a><br><br>

<a href="/books">Back to All Books</a>
</body>
</html>

<!-- 
Bootstrap Buttons:
https://www.w3schools.com/bootstrap/bootstrap_buttons.asp -->
