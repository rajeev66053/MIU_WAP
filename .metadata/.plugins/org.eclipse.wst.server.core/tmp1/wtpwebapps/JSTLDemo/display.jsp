<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <!-- Adding Tab library for JSTL. For using this url we need to have jstl-1.2.jar file in WEB-INF/lib folder. -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World <br>
	<% 	

	//This is one way of displaying label data
	String name=request.getAttribute("label").toString();
	out.println(name);
	%>
	<br>
	<!-- This is another way of displaying Label data. This is called expression language. -->
	${label }
	
	<br>
	
	<!--  Using JSTL Tag. For this we need to add taglib as added at the top of the page -->
	<c:out value="${label }" /><br>
	
	<c:out value="${student}" /><br>
	
	
	<c:out value="${student.name}" /><br>
	
	
	<c:forEach items="${students}" var="s">
	${s}
	${s.name}<br>
	</c:forEach>
	
</body>
</html>