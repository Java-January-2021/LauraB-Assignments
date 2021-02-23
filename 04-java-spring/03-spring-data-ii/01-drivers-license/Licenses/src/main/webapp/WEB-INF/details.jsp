<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/19/2021">

<title>${person.firstName} ${person.lastName}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	
		<h1>${person.firstName} ${person.lastName}</h1>
		
		<c:choose>
			<c:when test="${person.license !=null }">			
			<h3>License Number:  0000000<c:out value="${person.license.id}"/></h3><br>
			<h3>Expiration. Date:  <c:out value="${expDate}"/></h3><br>
			<h3>State:  <c:out value="${person.license.state}"/></h3><br>
			</c:when>
			<c:otherwise>
			
			<a href="/person/new">Add New Person</a>
			</c:otherwise>
		</c:choose>
		
		</div>

</body>
</html>