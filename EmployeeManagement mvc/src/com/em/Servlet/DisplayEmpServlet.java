package com.em.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
import com.em.util.ConnectionUtil;

/**
 * Servlet implementation class DisplayEmpServlet
 */
@WebServlet("/DisplayEmpServlet")
public class DisplayEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out = response.getWriter();
	   List<Employee> employeeList = new ArrayList<Employee>();  
	   try {     
			EmployeeService employeeService = new EmployeeServiceImpt();
			
			if(request.getParameter("empid")=="") {
			employeeList = employeeService.getAllEmployee();
			request.setAttribute("EmployeeList", employeeList);
			
			}else {
			int E_ID = Integer.valueOf(request.getParameter("empid"));	
		    employeeList = employeeService.getEmployeeByID(E_ID);		
			request.setAttribute("EmployeeList", employeeList);
			}// request.setAttribute("address", list2);
			RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/displayEmp.jsp");
			dispatcher.forward(request, response);
    	}catch (Exception e) {
		  out.println(e.getMessage());
		
        }
	}

}
