<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie Example</title>
</head>
<body>
	<%
		String cname = request.getParameter("cname");
		String cvalue = request.getParameter("cvalue");
		if (cname != null && cvalue != null) {
			Cookie ck = new Cookie(cname, cvalue);
			ck.setMaxAge(5);
			response.addCookie(ck);	
			out.println("Cookie Created!");
		} else { 
			Cookie cookies[] = request.getCookies(); 
			if (cookies.length >= 2) {
				out.println("Cookie Name="+cookies[1].getName());
				out.println("Cookie Value="+cookies[1].getValue());
			} else {
				out.println("Cookie Not Found!");
			}
		}
	%>
	<h1>Enter Your Cookie Name and Value</h1>
	<form action="/firstServlet/Cookies.jsp">
		<input name="cname" placeholder="Enter cookie name"/>
		<input name="cvalue" placeholder="Enter cookie value"/>
		<button type="submit">Create Cookie</button>
	</form>
</body>
</html>