<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (("Meenakshi".equals(username) || "meenakshi".equals(username)) && "password123".equals(password)) {
        session.setAttribute("user", username);
        response.sendRedirect("welcome.jsp");
    } else {
        out.println("<h1>Invalid Login. Please try again.</h1>");
    }
	%>
	
</body>
</html>