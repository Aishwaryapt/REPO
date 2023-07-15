<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:catch var="catchex">
<%

	int x=2/0;
out.println(x);
//String s=null;
//out.println(s.charAt(0));

%>

</c:catch>
<c:if test="${catchex!=null}">
	<p>There is an exception : ${catchex}</p>
</c:if>
</body>
</html>