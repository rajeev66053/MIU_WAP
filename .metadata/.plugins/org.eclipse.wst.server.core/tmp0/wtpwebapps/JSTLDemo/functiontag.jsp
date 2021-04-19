<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="Rajeev Thapaliya is a MIU student" ></c:set>
Length:${fn:length(str) }

<c:forEach items="${fn:split(str,' ')}" var="s">
<br>
${s}
</c:forEach>

Index:${fn:indexOf(str,"is") }
<br>

Is there: ${fn:contains(str,"MIU") }
<br>

<c:if test="${fn:contains(str,'MIU') }">
MIU is there
</c:if>
<br>

<c:if test="${fn:startsWith(str,'Rajeev')}">
It starts with Rajeev
</c:if>

<br>

<c:if test="${fn:endsWith(str,'student')}">
It end with student
</c:if>
<br>
LowerCase:${fn:toLowerCase(str) }

<br>
UpperCase:${fn:toUpperCase(str) }

</body>
</html>