 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Employee </title>
<link rel="stylesheet" href="../css/mystyle.css" />
</head>
<body>
<jsp:include page="header.jsp" />
</br></br>
<form action="../DisplayEmpServlet" method="get">
	<table align="center">
	<tr>
	 <td>Enter Employee ID to display data</td>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="text" name="empid"/> </div></td>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Display Data"/> </div></td>
	</tr>
	</table>



<form action="../DisplayEmpServlet" method="get">
	<table align="center">
	<tr>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Display all Employee Data"/> </div></td>
	</tr>
	</table>
</form>
</br></br>
<jsp:include page="footer.jsp" />
</body>
</html>