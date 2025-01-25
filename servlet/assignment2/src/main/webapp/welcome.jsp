<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<%
    String user = (String) session.getAttribute("user");
    if (user != null) {
	%>
    <h1>Welcome, <%= user %>!</h1>
	<%
    } else {
        response.sendRedirect("login.html");
    }
	%>	
</body>
</html>