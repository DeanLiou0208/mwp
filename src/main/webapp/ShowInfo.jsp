<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>員工登入成功畫面</title>
</head>
<body>
	<div>Hi, ${loggedInEmp.empname }</div>
	<div>ID: ${loggedInEmp.empid} </div>
	<div>薪水: ${loggedInEmp.salary }</div>
	<div>性別: ${loggedInEmp.sex}</div>
	<div>部門: ${loggedInEmp.deptid }</div>
	<a href='Logout.do'> <button>登出</button> </a>
</body>
</html>