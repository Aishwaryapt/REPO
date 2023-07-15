<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
 <h1>Product Details</h1>
    <p>
        Name: <%= request.getAttribute("name") %><br>
        Price: <%= request.getAttribute("price") %>
    </p>
</body>
</html>