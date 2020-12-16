package com.em.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.em.bean.Employee;

import com.em.service.EmployeeService;
import com.em.service.EmployeeServiceImpt;

/**
 * Servlet implementation class GetEmpDataToUpdate
 */
@WebServlet("/GetEmpDataToUpdate")
public class GetEmpDataToUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   int E_ID = Integer.valueOf(request.getParameter("empid"));
	   
	   List<Employee> employeeList = new ArrayList<Employee>();
	   try { 
	   EmployeeService employeeService = new  EmployeeServiceImpt();
	   employeeList = employeeService.getEmployeeByID(E_ID);
	   request.setAttribute("employeeList", employeeList);
	   RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/updateEmployee.jsp");
	   dispatcher.forward(request, response);
	   }catch (Exception e) {
	      e.getMessage();
	   }
	  
		
		
	}

	

}
