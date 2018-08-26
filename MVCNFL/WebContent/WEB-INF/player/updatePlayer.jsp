<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Update ${team.teamName}</title>
  </head>
  
  <body>
    <form action="updatePlayer.do" method="POST">
		<label for ="teamName">Team: </label>
		<input type="text" name="teamName">
		<br>
		<label for ="firstName">First Name: </label>
		<input type="text" name="firstName">
		<br>
		<label for ="lastName">Last Name: </label>
		<input type="text" name="lastName">
		<br>
		<label for ="position">Position: </label>
		<input type="text" name="position">
		<br>
		<label for ="number">Number: </label>
		<input type="text" name="number">
		<br>
		<label for ="age">Age: </label>
		<input type="text" name="age">
		<br>
		<label for ="height">Height: </label>
		<input type="text" name="height">
		<br>
		<label for ="weight">Weight: </label>
		<input type="text" name="weight">
		<br>
		<input type="submit" value="Update Player">
	
	</form>	
<a href="index.jsp">Home</a>
</html>