<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리2</title>
</head>
<body>

	<h1>JSTL Core</h1>
	
	
	<h2>if else</h2>
	<%-- 몸무게가 70이하면 치킨 몸무게가 80이하면 샐러드 그게 아니면 굶어 --%>
	
	<c:set var="weight" value="76"/>
	
	<c:choose>
		<%-- if(weight <= 70) --%>
		<c:when test="${weight <= 70 }">
			<h4>치킨</h4>
		</c:when>
		<%-- else if(weight <= 80) --%>
		<c:when test="${weight <= 80 }">
			<h4>샐러드</h4>
		</c:when>
		<%-- else --%>
		<c:otherwise>
			<h4>굶어</h4>
		</c:otherwise>
	
	</c:choose>
	
	
	<h2>반복문</h2>
	
	<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i }
	</c:forEach>
	
	<%-- for(String fruit:fruitList --%>
	<c:forEach var="fruit" items="${fruitList }" varStatus="status" >
		<h4>${fruit } :::: ${status.count } ${status.index } ${status.first } ${status.last }</h4>
	</c:forEach>
	

</body>
</html>
	
	
	
	
	