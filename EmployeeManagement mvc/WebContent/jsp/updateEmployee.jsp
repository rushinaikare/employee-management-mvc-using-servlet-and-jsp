<%@page import="com.em.bean.Address"%>
<%@page import="com.em.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%ArrayList employeeList = (ArrayList)request.getAttribute("employeeList"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link rel="stylesheet" type="text/css" href="./css/mystyle.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/formvalidation.js"></script>
</head>
<body>
<jsp:include page="header.jsp" />
</br></br>

<%Employee employee =(Employee)employeeList.get(0); %>
	<%Address address = employee.getAddress();%>

<form name="updateEmp" action="UpdateEmpServlet" method="post" onsubmit="return validateUpdateEmp();">
	<table align="center">
	<h2 align="center"> Old Data of Employee Id =<%=employee.getE_ID()%></h2>

	<tr>
	<td>Employee ID </td>
	<td> <input type="text" name="empid" value=<%=employee.getE_ID() %> size="30"> </td>
	</tr>
	<tr>
	<td width="50%">First Name </td>
	<td width="50%"> <input type="text" name="firstName" value=<%=employee.getFirstName() %> size="30" required> </td>
	</tr>
	<tr>
	<td>Last Name </td>
	<td><input type="text" name="lastName" value=<%=employee.getLastName() %> size="30" required></td>
	</tr>
	<tr>
	<td>Age </td>
	<td><input type="text" name="age" value=<%=employee.getAge() %> size="30" required/><span id="ageid"></span></td>
	</tr>
	<tr>
	<td>Street/Area  </td>
	<td><input type="text" name="street" value=<%=address.getStreetName() %> size="30" required></td>
	</tr>
	<tr>
	<td>City </td>
	<td><input type="text" name="city" value=<%=address.getCityName() %> size="30" required></td>
	</tr>
	<tr>
	<td>State </td>
	<td><input type="text" name="state" value=<%=address.getStateName() %> size="30" required></td>
	</tr>
	<tr>
	<td>Postal Code </td>
	<td><input type="text" name="postalcode" value=<%=address.getPostalCode() %> size="30" required><span id="postalid"></span></td>
	</tr>
	
	<tr>
	<td colspan="2" align="center"> <br/> <div align="center"><input type="submit" value="Update Employee"/> </div></td>
	</tr>
	</table>
</form>
</br></br>
<jsp:include page="footer.jsp" />
</body>
</html>