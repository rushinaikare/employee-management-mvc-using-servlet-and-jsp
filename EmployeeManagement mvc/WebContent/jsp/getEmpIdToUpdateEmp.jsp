
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Get employee Id</title>
<link rel="stylesheet" href="../css/mystyle.css" />
</head>
<body>
<jsp:include page="header.jsp" />
</br></br>
<form action="../GetEmpDataToUpdate" method="get">
	<table cellspacing ="10px" align="center">
	<tr>
	
	<td> Enter Employee ID to update data</td>

	<td colspan="2" align="center">  <div align="center"><input type="text" name="empid" required/> </div></td>
	</tr>
	
	<tr>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Display Previous Data"/> </div></td>
	</tr>
	</table>




</form>
</br></br>
<jsp:include page="footer.jsp" />
</body>
</html>