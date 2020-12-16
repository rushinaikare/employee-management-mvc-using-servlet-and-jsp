 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Employee </title>
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/formvalidation.js">
</script>
</head>
<body>
<jsp:include page="header.jsp" />
</br></br>
<form name="createEmp" action="../CreateEmpServlet"  method="post" onsubmit="return validate();" >
	<table align="center">
	
	
	
	<tr>
	<td width="50%">First Name </td>
	<td width="50%"> <input type="text" name="firstName" size="30" required > </td>
	</tr>
	<tr>
	<td>Last Name </td>
	<td><input type="text" name="lastName" size="30" required ></td>
	</tr>
	<tr>
	<td>Age </td>
	<td><input type="text" name="age" size="30" required/><span id="ageid"></span></td>
	 </tr>
	 
	<tr>
	<td>Street/Area  </td>
	<td><input type="text" name="street" size="30" required ></td>
	</tr>
	<tr>
	<td>City </td>
	<td><input type="text" name="city" size="30" required ></td>
	</tr>
	<tr>
	<td>State </td>
	<td><input type="text" name="state" size="30" required ></td>
	</tr>
	<tr>
	<td>Postal Code </td>
	<td><input type="text" name="postalcode" size="30" required/><span id="postalid"></span></td>
	</tr>
	<tr>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Add Employee"/> </div></td>
	</tr>
	</table>
</form>

<jsp:include page="footer.jsp" />
</body>
</html>