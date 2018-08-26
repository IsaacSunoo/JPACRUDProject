<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Delete Player</title>
  </head>
  
  <body>
    <form action="deletePlayer.do" method="POST">
      <label for="playerId">Player ID:</label>
      <input type="text" name="playerId">
      <br>
      <input type="submit" value="Delete Player">
    </form>
    <a href="index.jsp">Home</a>
  </body>
</html>