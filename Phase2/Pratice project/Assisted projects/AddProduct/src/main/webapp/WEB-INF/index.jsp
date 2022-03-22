<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add a Product</h2>

<form action="/AddProduct" method="get">
   Name: <input type="text" id="name" placeholder="Name" name="name" required> <br><br>
   Color: <input type="text" id="color" placeholder="Color" name="color" required> <br><br>
   Price(enter a number): <input type="text" id="price" placeholder="Price" name="price" required> <br><br>
   
   <button type="submit">Enter</button>
</form>

</body>
</html>