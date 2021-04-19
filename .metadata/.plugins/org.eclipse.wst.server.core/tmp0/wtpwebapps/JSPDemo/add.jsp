<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- JSP run below Tomcat 10. 
It doesnot work in Tomcat 10.
Right click on project name. 
Go to properties.Click on project facets.
 In runtime choose Tomcat 9 v  -->
<body bgcolor="cyan">

<!-- Inside anchor percent @ is called directive. we can write import data code inside it. For multiple import we can write comma and add import else write one import -->
		<%@ page import="java.util.*,java.io.*" %>
		
		<!-- Inside anchor percent @ include we can include another jsp file -->
<%@ include file="header.jsp" %>

<!-- Inside anchor percent not are called declaration.What we write inside it will be used in servlet a global variable. -->
		<%!
		int k=0; int y=3;
		%>
<!-- Inside body code anchor and percent closure code are called Scriptlet. This code will go inside Servlet doGet or doPost function while translating JSp to Servlet  -->
	
	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k=i+j;
		
		//This is one wauy of printing data. Another way is using  ancho percent  equal to sign as below
		out.println("Output :"+k);
		out.println("<br>");
		
	%>
	<!-- The content inside anchor percent equal to tag is called expression -->
	<%= y %>
		
		
</body>
</html>