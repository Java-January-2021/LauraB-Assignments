<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/19/2021">

<title>New Person</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<h1>Add New Customer</h1><br>
		
		<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
		
			<form:form method="POST" action="/persons/newPerson" modelAttribute="person">
				<div class="form-group">
					<form:label path="firstName">First Name</form:label>
					<form:input type="text" path="firstName"/>
					<form:errors path="firstName"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="lastName">Last Name</form:label>
					<form:input type="text" path="lastName"/>
					<form:errors path="lastName"></form:errors>
				</div>
				<input class="btn btn-primary" type="submit" value="Next"/> <a href="/" class="btn btn-danger">Cancel</a>
			</form:form><br>
		</div>
</body>
</html>