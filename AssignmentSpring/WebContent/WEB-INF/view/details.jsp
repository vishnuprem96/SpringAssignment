<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
<h2>CRM - RelationShip Management</h2>
<input type="button" value="Add User" 
onclick="window.location.href='form';  return false;" />


<table border="1" width="80%">
<tr>
<th>Username</th>
<th>Password</th>
<th>Gender</th>
<th>Country</th>

</tr>

<c:forEach var="tempUser" items="${userss}">
  



<tr>
<td>${tempUser.username}</td>
<td>${tempUser.password}</td>
<td>${tempUser.gender}</td>
<td>${tempUser.country}</td>


</c:forEach>

</table>


</body>
</html>