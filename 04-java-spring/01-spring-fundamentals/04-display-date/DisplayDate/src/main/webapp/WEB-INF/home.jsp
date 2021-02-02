<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Date/Time Buttons</title>
</head>
<body>

		<a href="/date"><button onclick="dateAlert()">Today's Date</button></a>
		<a href="/time"><button onclick="timeAlert()">Current Time</button></a>

</body>
</html>