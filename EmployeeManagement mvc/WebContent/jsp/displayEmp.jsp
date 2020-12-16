
<%@page import="java.util.Arrays"%>
<%@page import="com.em.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import = "com.em.bean.Address" %> 
    <%@ page import = "java.util.ArrayList" %>


<%ArrayList list1 = (ArrayList)request.getAttribute("EmployeeList"); %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Employee </title>
<link rel="stylesheet" href="css/mystyle.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/formvalidation.js"></script>


</head>
<body>
<jsp:include page="header.jsp" />
</br></br>

<div>
    <form name="display" action="./updateDelete" method="post"> 
	<table class="record" align="center">
	<tr>
	<th>Employee ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	<th>Street</th>
	<th>City</th>
	<th>State</th>
    <th>Postal Code</th>
	</tr>
	
	<% for(int i = 0 ; i < list1.size() ; i++){ %>
	<%Employee employee =(Employee)list1.get(i); %>
	<%Address address = employee.getAddress();%>
	<tr id=<%=i %>>
	 <td><%=employee.getE_ID() %></td>
	 <td><%=employee.getFirstName() %> </td>
     <td><%=employee.getLastName() %>  </td>
	 <td><%=employee.getAge()%>  </td>
	 <td><%=address.getStreetName() %></td>
	 <td><%=address.getCityName() %></td>
	 <td><%=address.getStateName() %></td>
	 <td><%=address.getPostalCode()%></td>
	   
	    
	</tr>
	<% } %>
	</table>
   </form>
</div>
</br></br>
<jsp:include page="footer.jsp" />
</body>
</html>