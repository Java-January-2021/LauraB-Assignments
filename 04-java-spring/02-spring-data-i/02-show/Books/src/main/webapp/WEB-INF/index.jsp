<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books dot Com</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<div class="container">
		<h1>Welcome to Books dot Com</h1>
		<h3>Books Catalog</h3>
		
		<table class="table table-dark">
			<thead>
				<tr>
					<th>id</th>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
			</thead>
				<tbody>
				<!-- Loop through all of the books -->
					<c:forEach items="${allBooks}" var="book">
					<tr>
						<td>${book.id}</td>
						<td>${book.title} </a></td>
						<td>${book.description}</td>
						<td>${book.language}</td>
						<td>${book.numberOfPages}</td>
<!-- 						<td><a href="/books/${book.id}/delete/">Delete</a></td> -->
					</tr>
					</c:forEach>
				</tbody>
								
			</table>
			
	</div>

</body>
</html>