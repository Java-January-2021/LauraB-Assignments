<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/19/2021">

<title>New License</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Enter Customer Details</h1><br>
				<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
			<form:form method="POST" action="/licenses/newLicense" modelAttribute="license"> <!-- correlates with line 66 of license controller -->
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
				<input class="btn btn-success" type="submit" value="View License Info"/> <a href="/" class="btn btn-danger">Exit</a>
			</form:form>
	</div>
</body>
</html>