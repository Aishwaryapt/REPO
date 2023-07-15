<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product details</title>
</head>
<body>
 <h1>Product Details Form</h1>
    <form action="productServlet" method="POST">
        <label for="name">Product Name:</label>
        <input type="text" name="name" id="name" required><br>
        
        <label for="price">Product Price:</label>
        <input type="number" name="price" id="price" required><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>