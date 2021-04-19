<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<table>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lecture 5</title>
	</head>
	<body>
	
	<!-- One way of displaying data -->
	<%@ page import="com.miu.model.Student" %>
	
	<% 
	Student students[]=(Student[])request.getAttribute("students");
	out.println("<table>");
	for(Student student:students){
		out.println("<tr>");
		out.println("<td>"+student.getName()+"</td>");
		out.println("<td>"+student.getAge()+"</td>");
		out.println("</tr>");
	}

	out.println("</table>");
	
	%>
	
	<br>
	<br>
	
	<!-- Other way of displaying data -->
		<table>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.getName()}</td>
					<td>${student.getAge()}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
	</html>