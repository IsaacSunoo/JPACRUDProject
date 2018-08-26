<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Player</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<c:choose>
	<c:when test="${not empty team }">
	<div>
	  <h4>${team.teamName}</h4> 
	  
	  <table>
	  	<tr>
	  		<th>Name</th>
	  		<th></th>
	  		<th>Position</th>
	  		<th>Number</th>
	  		<th>Age</th>
	  		<th>Height</th>
	  		<th>Weight</th>
	  	</tr>
	  	<tr>
	  	   	<td>${team.firstName}</td>
	  	 	<td>${team.lastName }</td>
	  	 	<td>${team.position }</td>
	  	 	<td>${team.playerNumber }</td>
	  	 	<td>${team.age }</td>
	  	 	<td>${team.height }</td>
	  	 	<td>${team.weight }</td>
	  	 </table>
	  	 </div>
	  </c:when>
	  <c:otherwise>
	  <h3>No Matching Player Found</h3>
	  <br>
	  </c:otherwise>
	 
</c:choose>
<br>
	<div>
	<a href="index.do" class="btn btn-primary btn-dark" role="button" aria-pressed="true">Home</a>
	<form action="updatePlayer.do" method="POST">
		<button type="submit" class="btn btn-dark">Update Player</button>
	</form>
	<form action="deletePlayer.do" method="POST">
		<button type="submit" class="btn btn-dark">Delete Player</button>
	</form>
	</div>
	
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	</body>
	</html>