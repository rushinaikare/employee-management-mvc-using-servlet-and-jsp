package com.em.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.em.bean.Address;
import com.em.bean.Employee;
import com.em.exception.EmployeeException;
import com.em.service.EmployeeService;
import com.em.service.EmployeeServiceImpt;

/**
 * Servlet implementation class UpadateEmpServlet
 */
@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      // int  E_ID  = Integer.valueOf(request.getParameter("")); 
		PrintWriter out = response.getWriter();
		
  try {
	   int E_ID = Integer.valueOf(request.getParameter("empid"));
	   String FirstName = request.getParameter("firstName");
	   String LastName = request.getParameter("lastName");
	   int Age = Integer.valueOf(request.getParameter("age"));
	   String streetName = request.getParameter("street");
	   String cityName = request.getParameter("city");
	   String stateName = request.getParameter("state");
	   String postalCode = request.getParameter("postalcode");
	   
	   Employee employee  = new Employee(FirstName, LastName, Age);
       Address address = new Address(streetName, cityName, stateName, postalCode);
	   
       
	   EmployeeService employeeService = new EmployeeServiceImpt();
	   employeeService.updateEmployee(E_ID, employee, address);
	  
	      
  }catch (EmployeeException e) {
	      out.println(e.getMessage());   
	      System.out.println(e.getStackTrace());
	      e.printStackTrace();
     } 

     response.sendRedirect("index.jsp");	
	}

}
