<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href= "css/styles.css">
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - February 1, 2021">

<title>Current visit count</title>
</head>
<body>
	<div class="container">
		<h1>You have visited http://localhost:8080/ <c:out value=" ${count}"/> time(s)</h1>
		<h4>Visit again? --> <a href="/">Click here</a></h4>
		<div>
			<a href="/reset"><button>Reset the Counter</button></a>
		</div>
	</div>
	
	
</body>
</html>