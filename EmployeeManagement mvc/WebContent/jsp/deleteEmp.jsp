 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
<link rel="stylesheet" href="../css/mystyle.css" />
</head>
<body>
<jsp:include page="header.jsp" />
</br></br>
<form action="../DeleteEmpServlet" method="post">
	<table align="center">
	
	
	<tr>
	<td>Enter Employee Id to delete Data</td>
	<td > <input type="text" name="empid" required /></td>
	</tr>
	
	<tr>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Delete Data"/> </div></td>
	</tr>
	</table>
</form>
</br></br>
<jsp:include page="footer.jsp" />
</body>
</html>
