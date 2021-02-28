<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/27/2021">

<title>Show Product:  ${product.name}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h3>Product:  </h3>
		<p>-- ${ product.name }</p><br>
		
		<h3>Description:  </h3>
		<p>-- ${ product.description }</p>
		
		<hr><hr>
		<h3>Categories</h3>
			<ul type = "square">
				<c:forEach items="${ product.categories }" var="cat">
					<li>${ cat.name }</li>			
				</c:forEach>
			</ul>
		
		<form action="/product/${ product.id }" method="POST">
			<label>Select category for ${ product.name }: </label> 
			
			<select name="category">
				<c:forEach items="${ catNotInProduct }" var="cat">
			        	<option value=${ cat.id }>${ cat.name }</option>
			    </c:forEach> 
			</select> 
			<button>Add</button>
		</form><br>
		<a href="/">Home</a> | <a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a>
	</div>
</body>
</html>