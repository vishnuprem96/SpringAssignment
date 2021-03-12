<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveUser" method="POST" modelAttribute="users">
 <form:hidden path="id"/> 
<table>
<tbody>
<tr>
<td><label>Username </label></td>
<td><form:input path="user_name"/></td>
</tr>

<tr>
<td><label>Password</label></td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td><label>Gender: </label></td>
<td>  
Male    <form:radiobutton path="gender" value="Male"/>  
Female   <form:radiobutton path="gender" value="Female"/></td>
</tr>

<tr>
<td><label>Country </label></td>
<td><form:select path="country">  
        <form:option value="India" label="India"/>  
        <form:option value="U.S.A" label="U.S.A"/>  
        <form:option value="Australia" label="Australia"/>  
        <form:option value="Canada" label="Canada"/>  
        </form:select>  </td>
</tr>

<tr>
<td><label>Terms and Conditions </label></td>
<td><form:checkbox path="terms" value="yes"/></td>
</tr>


<tr>
<td><label></label></td>
<td><input type="submit" value="Save"></td>
</tr>

</tbody>

</table>
</form:form>

</body >
</html>