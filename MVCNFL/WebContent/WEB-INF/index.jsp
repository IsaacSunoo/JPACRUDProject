<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NFL's AFC West Site</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<h2>AFC West</h2>
<br>
<h3>Lookup Player By ID</h3>

<form action="getPlayer.do" method="GET">
  <input type="text" name="id"/>
  <button type="submit" class="btn btn-dark">Find Player</button>
</form>
<br>

<h3>Create A New Player</h3>
<form action="newPlayer.do" method="POST">
	<button type="submit" class="btn btn-dark">Create Player</button>
</form>
<br>

<h3>Edit A Player</h3>
<form action="updatePlayer.do" method="GET">
    <input type="text" name="id"/>
	<button type="submit" class="btn btn-dark">Update Player</button>
</form>
<br> 

<h3>All Players in the DB</h3>

  <form action="teams.do" method="GET">
  <button type="submit" class="btn btn-dark">View All Players</button>
  </form>
  <br>
  
  <c:if test="${not empty teams}">
  	<table>
  		<tr>
  			<th>Team</th>
  			<th>First Name</th>
  			<th>Last Name</th>
  		</tr>
  		<c:forEach var="team" items="${teams}">
  		<tr>
			<td><a href="getPlayer.do?id=${team.id }">${team.teamName }</a></td>
			<td>${team.firstName }</td>
			<td>${team.lastName }</td>
  		 </tr>
		</c:forEach>
  	
  	</table>
  
  </c:if>
  
	
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>