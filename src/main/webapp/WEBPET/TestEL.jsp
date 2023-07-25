<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String title = "This is a JSP Page";
	request.setAttribute("contentTitle", title);
	%>

	<%
	Map<String, String> map = new HashMap<String, String>();
	map.put("username", "Allen");
	map.put("password", "1234");
	request.setAttribute("login", map);
	%>

	<div>
		標題: ${contentTitle}<br> 你的名稱: ${login.username}<br> 你的密碼:
		${login.password}<br>
	</div>

	<div>
		request: ${requestScope}<br>
		sessionScope${sessionScope}<br>
	</div>
	
	<div>
		param: ${param.login.password }<br>
		cookie: ${cookie.name.value }<br>
	</div>

</body>
</html>