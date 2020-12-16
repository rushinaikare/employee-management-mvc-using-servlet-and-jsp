package com.em.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.em.service.*;

import com.em.exception.EmployeeException;
/**
 * Servlet implementation class DeleteEmpServlet
 */
@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        int E_ID = Integer.valueOf(request.getParameter("empid"));
        
        try {
        	EmployeeService employeeService = new EmployeeServiceImpt();
        	employeeService.deleteEmployee(E_ID);
        	
        	
        }catch (EmployeeException e) {
             e.getMessage(); 
             
		}
		
		response.sendRedirect("index.jsp");
	}

}
