<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="123456789"></c:out>
	<br>
	<div>=================================================</div>
	<c:out value="&lt" default="" escapeXml="true"></c:out>
	<br>
	<c:out value="&lt" default="" escapeXml="false"></c:out>
	<br>

	<c:set var="MyName" value="Dean" scope="request"></c:set>

	<div>RequestScope: ${requestScope }</div>

	<%-- 	<c:remove var="MyName"/> --%>

	<%-- 	<div>RequestScope: ${requestScope }</div> --%>

	<div>=================================================</div>
	<c:catch var="MyE">
		${5/0}
	</c:catch>

	<div>${MyE}</div>
	<div>=================================================</div>

	<c:if test="${MyName != null } ">
		<div>已登入,歡迎您,${MyName}</div>
	</c:if>

	<c:if test="${MyName == null }">
		<div>
			<button>登入</button>
		</div>
	</c:if>
	<div>=================================================</div>

	<%
	ArrayList<String> petList = new ArrayList<String>();
	petList.add("小白");
	petList.add("小黑");
	petList.add("小綠");
	petList.add("小黃");
	petList.add("小橙");
	petList.add("小藍");
	request.setAttribute("pList", petList);
	%>

	<c:forEach items="${ pList }" var="p" varStatus="s">
		<div>第${ s.index +1}隻寵物名稱:${ p }</div>
	</c:forEach>

	<div>=================================================</div>
	<c:forEach begin="0" end="${ pList.size()-1 }" var="i" step="1">
		<div>第${i+1}隻寵物:${pList[i]}</div>
	</c:forEach>

	<div>=================================================</div>
	<c:import url="https://www.google.com"></c:import>

	<div>=================================================</div>

	<c:forTokens items="a,b,c,d,e,f,g" delims="," var="t">
		${ t }
	</c:forTokens>
	
	<div>=================================================</div>
	
	<c:if test="${0!=0}">
	<c:redirect url="https//tw.yahoo.com" >
	<c:param name="aaa" value="bbbb"></c:param>
	</c:redirect>
	</c:if>
	
	<div>=================================================</div>
	
	<c:url value="TestEL.jsp" var="toYahoo"> </c:url>
	<c:param name="aa" value="bbb"></c:param>
	
	<div><a href="${ toYahoo }"> 連結 </a> </div>


</body>
</html>