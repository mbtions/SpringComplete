<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calc</title>
</head>
<body>
	<h1>Calculator</h1>
	<%!
		int s = 0;
	%>
	<%!
		int sum(int n1, int n2) {
		return n1+n2;
	}
	%>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		// s = num1 + num2;
		// s = sum(num1, num2);
	%>
	<!-- <h1>Sum of Two Number is =<%= s %></h1> -->
	<h1>Sum of Two Number is =<%=sum(num1, num2) %></h1>
	<h1>Session ID=<%=session.getId() %></h1>
</body>
</html>