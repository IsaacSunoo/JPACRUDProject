<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Update ${team.teamName}</title>
  </head>
  
  <body>
    <form action="updatePlayer.do" method="POST">
	<label for ="teamName">Team: </label>
	<input type="text" name="teamName" value="teamName">
	<br>
	<label for ="firstName">First Name: </label>
	<input type="text" name="firstName" value="firstName">
	<br>
	<label for ="lastName">Last Name: </label>
	<input type="text" name="lastName" value="lastName">
	<br>
	<label for ="number">Number: </label>
	<input type="text" name="number" value="number">
	<br>
	<label for ="age">Age: </label>
	<input type="text" name="age" value="age">
	<br>
	<label for ="height">Height: </label>
	<input type="text" name="height" value="height">
	<br>
	<label for ="weight">Weight: </label>
	<input type="text" name="weight" value="weight">
	<br>
	<input type="submit" value="Update Player">
</form>	
<a href="index.jsp">Home</a>
</html>