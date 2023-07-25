<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的寵物</title>
</head>
<body>
	<%!String myName = "Dean"; %>
	<% String[] petArray = new String[]{"小白","小黃"}; %>
	<div>
	<%="你的名字:"+myName  %>
	</div>
	
	<div>
	<%for(String myPet : petArray){ %>
	<%= myPet %>
	<%} %>
	</div>
</body>
</html>