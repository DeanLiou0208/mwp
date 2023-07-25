<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
	List<String> aList = new ArrayList<String>();
	aList.add("a");
	aList.add("b");
	aList.add("c");
	aList.add("d");
	aList.add("e");
	%>
	<%=aList %>
	
	<%@include file="TestScripting.jsp" %>
	
	
</body>
</html>