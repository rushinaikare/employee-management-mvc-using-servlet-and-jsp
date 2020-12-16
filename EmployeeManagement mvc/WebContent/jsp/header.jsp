<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1>
Employee Management System
</h1>
</div>
<br/>
<table cellspacing="10px" align="center">
	
	<tr>
	  
		<td> <a href="${pageContext.request.contextPath}/jsp/createEmployee.jsp">Create Employee</a> </td>
		<td> <a href="${pageContext.request.contextPath}/jsp/readEmp.jsp">Search Employee</a> </td>
		<td> <a href="${pageContext.request.contextPath}/jsp/getEmpIdToUpdateEmp.jsp">Update Employee</a> </td>
		<td> <a href="${pageContext.request.contextPath}/jsp/deleteEmp.jsp">Delete Employee</a> </td>
	  
	</tr>
	
</table>
</body>
</html>