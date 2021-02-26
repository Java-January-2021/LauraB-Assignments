<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/26/2021">

<title>Add a Dojo - Index</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<div class="container">

	<h1>Welcome to Dojo and Ninjas</h1><br>
	<h3>Create a Dojo</h3><br>
	
			<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>

			<form:form method="POST" action="/" modelAttribute="dojo">
			
				<div class="form-group">
					<form:label path="name">Dojo Name: </form:label>
				    <form:input type="text" path="name"/>
				    <form:errors path="name"></form:errors>   
				</div>
			
				<input class="btn btn-success" type="submit" value="Create"/><br><br>

				<hr><hr><br>
				
				<h3>Add a Ninja to a Dojo</h3><br>
			
				<a href="/ninjas/new" class="btn btn-primary">New Ninja</a>
			</form:form>
</div>

</body>
</html>