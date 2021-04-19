<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3307/mario" user="root" password=""/>
	
<!-- var is result set -->
	<sql:query var="rs" datasource="${db }">Select * from gadgets</sql:query>
	
	<c:forEach items="${rs.rows}" var="gadget">
	<c:out value="${gadget.gid }"></c:out>
	<c:out value="${gadget.name }"></c:out>
	<c:out value="${gadget.price }"></c:out>
	
	<br>
	</c:forEach>

</body>
</html>