<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Player</title>
</head>
<body>

<h2>Add New Player</h2>
<br>
<br>
<form action="newPlayer.do" method="POST">
	<label for ="teamName">Team: </label>
	<input type="text" name="teamName" value="teamName" required>
	<br>
	<label for ="firstName">First Name: </label>
	<input type="text" name="firstName" value="firstName" required>
	<br>
	<label for ="lastName">Last Name: </label>
	<input type="text" name="lastName" value="lastName" required>
	<br>
	<label for ="number">Number: </label>
	<input type="text" name="number" value="number" required>
	<br>
	<label for ="age">Age: </label>
	<input type="text" name="age" value="age" required>
	<br>
	<label for ="height">Height: </label>
	<input type="text" name="height" value="height" required>
	<br>
	<label for ="weight">Weight: </label>
	<input type="text" name="weight" value="weight" required>
	<br>
	<input type="submit" value="Add Player">
</form>	
<a href="index.jsp">Home</a>

</body>
</html>
    