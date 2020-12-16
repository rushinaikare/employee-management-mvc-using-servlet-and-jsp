package com.em.service;

import com.em.bean.Employee;

import java.sql.SQLException;
import java.util.List;

import com.em.bean.Address;
import com.em.exception.EmployeeException;

public interface EmployeeService {

	int createEmployee(Employee employee, Address address) throws EmployeeException;

	int updateEmployee(int E_ID, Employee employee, Address address) throws EmployeeException;

	void displayEmployee(int E_ID) throws EmployeeException;

	int deleteEmployee(int E_ID) throws EmployeeException;

	List<Employee> getAllEmployee() throws EmployeeException, SQLException;
	
	List<Employee> getEmployeeByID(int E_ID) throws EmployeeException,SQLException;
}
