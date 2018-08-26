<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Player</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<h2>Add New Player</h2>
<br>
<form action="newPlayer.do" method="POST">
	<label for ="teamName">Team: </label>
	<input type="text" name="teamName" required>
	<br>
	<label for ="firstName">First Name: </label>
	<input type="text" name="firstName"  required>
	<br>
	<label for ="lastName">Last Name: </label>
	<input type="text" name="lastName" required>
	<br>
	<label for ="position">Position: </label>
	<input type="text" name="position" required>
	<br>
	<label for ="number">Number: </label>
	<input type="text" name="number" required>
	<br>
	<label for ="age">Age: </label>
	<input type="text" name="age" required>
	<br>
	<label for ="height">Height: </label>
	<input type="text" name="height" value="(in feet and inches)" required>
	<br>
	<label for ="weight">Weight: </label>
	<input type="text" name="weight" value="in lbs" required>
	<br>
	<input type="submit" value="Add Player">
</form>
<br>	
<a href="index.do" class="btn btn-primary btn-dark" role="button" aria-pressed="true">Home</a>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
    