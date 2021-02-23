<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/19/2021">

<title>Get New License</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<a href="/person/newPerson">Select Person</a>
		<h1>New License</h1>
				<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
			<form:form method="POST" action="/license/add" modelAttribute="license">
				<div class="form-group">
					<form:label path="person">Person:</form:label>
					<form:select type="select" path="person">
						<c:forEach items="${everyPerson}" var="person">
							<form:option value="${person.id}">${person.firstName} ${person.lastName}</form:option>
						</c:forEach>
					</form:select>
					<form:errors path="person"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="expirationDate">Expiration Date:</form:label>
					<form:input type="date" path="expirationDate"/>
					<form:errors path="expirationDate"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="state">State:</form:label>
					<form:input type="text" path="state"/>
					<form:errors path="state"></form:errors>
				</div>
					<a href="/license/details" class="btn btn-success">Generate License</a>	
			</form:form>
	</div>
</body>
</html>