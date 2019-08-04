<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Template</title>
<link rel="stylesheet" type="text/CSS" href="Style.CSS">
<script type="text/javascript" src="app.js"></script>
</head>
<body>
<h1 class="blue"><c:out value="${date.getWeekDay()}" /> , the <c:out value="${date.getDay()}" /> of 
 <c:out value="${date.getMonth()}" /> , <c:out value="${date.getYear()}" /></h1>
</body>
</html>
