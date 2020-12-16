package com.em.dao;

import com.em.bean.Employee;
import com.em.exception.EmployeeException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.em.bean.Address;

public interface EmployeeDao {

	int createEmployee(Employee employee, Address address) throws EmployeeException;

	int updateEmployee(int E_ID, Employee emplyee, Address address) throws EmployeeException;

	void displayEmployee(int E_ID) throws EmployeeException;

	int deleteEmployee(int E_ID) throws EmployeeException;
	
	List<Employee> getAllEmployee() throws EmployeeException, SQLException;
	
	List<Employee>getEmployeeByID(int E_ID) throws EmployeeException, SQLException;
}
