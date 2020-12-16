package com.em.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.em.bean.Address;
import com.em.bean.Employee;
import com.em.exception.EmployeeException;
import com.em.util.ConnectionUtil;

public class EmployeeDaoMysql implements EmployeeDao {

	public int createEmployee(Employee employee, Address address) throws EmployeeException {
		
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Employee values(E_ID,?,?,?)");
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setInt(3, employee.getAge());
			preparedStatement.executeUpdate();
			PreparedStatement preparedStatement2 = connection.prepareStatement("insert into Emp_Address values(E_ID,?,?,?,?)");
			preparedStatement2.setString(1, address.getStreetName());
			preparedStatement2.setString(2, address.getCityName());
			preparedStatement2.setString(3, address.getStateName());
			preparedStatement2.setNString(4, address.getPostalCode());
			preparedStatement2.executeUpdate();
			//Statement statement = connection.createStatement();
			//ResultSet result = statement.executeQuery("Select * from Employee");
	
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return 0;
	}

	public int updateEmployee(int E_ID, Employee employee, Address address) throws EmployeeException {

		try {
			Connection connection = ConnectionUtil.getConnection();

			PreparedStatement preparedStatement = connection
					.prepareStatement("update Employee SET FirstName =?,LastName = ?,Age = ? where E_ID =?");
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setInt(3, employee.getAge());
			preparedStatement.setInt(4, E_ID);
			preparedStatement.executeUpdate();
			PreparedStatement preparedStatement2 = connection.prepareStatement("update Emp_Address SET Street =?,City=?,State=?,PostalCode=? where E_ID =?");
			preparedStatement2.setString(1, address.getStreetName());
			preparedStatement2.setString(2, address.getCityName());
			preparedStatement2.setString(3, address.getStateName());
			preparedStatement2.setNString(4, address.getPostalCode());
			preparedStatement2.setInt(5, E_ID);
			preparedStatement2.executeUpdate();

		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}

		return 0;
	}

	public void displayEmployee(int E_ID) throws EmployeeException {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee where E_ID = ? ");
			preparedStatement.setInt(1, E_ID);
			ResultSet result = preparedStatement.executeQuery();
			PreparedStatement preparedStatement2 = connection.prepareStatement("select * from Emp_Address where E_ID =?");
			preparedStatement2.setInt(1, E_ID);
			ResultSet result1 = preparedStatement2.executeQuery();
			while (result.next() && result1.next()) {
				System.out.print("E_ID=" + result.getInt(1) + " First Name=" + result.getString(2) + " Last Name="+ result.getString(3) + " Age=" + result.getInt(4));
				System.out.println(" Street=" + result1.getString(2) + " City=" + result1.getString(3) + " State="+ result1.getString(4) + " PostalCode=" + result1.getString(5));
			 Employee employee = new Employee(result.getString(2), result.getString(3), result.getInt(4));
			 Address address = new Address(result1.getString(2),result1.getString(3),result1.getString(4),result1.getString(5))	;
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());

		}
	}

	public int deleteEmployee(int E_ID) throws EmployeeException {
		try {
			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from Employee where E_ID =?");
			preparedStatement.setInt(1, E_ID);
			PreparedStatement preparedStatement2 = connection.prepareStatement("delete from Emp_Address where E_ID = ?");
			preparedStatement2.setInt(1, E_ID);
			preparedStatement2.executeUpdate();
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}

		return 0;
	}
	
	public List<Employee> getAllEmployee() throws EmployeeException, SQLException {
		List<Employee> employeeList = new ArrayList<>();
		Connection connection = ConnectionUtil.getConnection();
    	 PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee");
    	 ResultSet result = preparedStatement.executeQuery();
    	 PreparedStatement preparedStatement1 = connection.prepareStatement("select * from Emp_Address");
    	 ResultSet result1 = preparedStatement1.executeQuery();
    	 
    	 while (result.next() && result1.next()) {
    		 Employee employee = new Employee();
    		 Address address = new Address();
             employee.setE_ID(result.getInt(1));
             employee.setFirstName(result.getString(2));
             employee.setLastName(result.getString(3));
             employee.setAge(result.getInt(4));
      	     address.setStreetName(result1.getString(2));
      	     address.setCityName(result1.getString(3));
      	     address.setStateName(result1.getString(4));
      	     address.setPostalCode(result1.getString(5));
      	     employee.setAddress(address);
      	     employeeList.add(employee);
    	}
    	return employeeList;
	}
	
     public	List<Employee> getEmployeeByID(int E_ID) throws  EmployeeException,SQLException{
 		List<Employee> employeeByID = new ArrayList<>();
 		Connection connection = ConnectionUtil.getConnection();
     	 PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee where E_ID = ?");
     	 preparedStatement.setInt(1, E_ID);
     	 ResultSet result = preparedStatement.executeQuery();
     	 PreparedStatement preparedStatement1 = connection.prepareStatement("select * from Emp_Address where E_ID = ?");
     	preparedStatement1.setInt(1, E_ID);
     	 ResultSet result1 = preparedStatement1.executeQuery();
     	 
     	 while (result.next() && result1.next()) {
     		 Employee employee = new Employee();
     		 Address address = new Address();
              employee.setE_ID(result.getInt(1));
              employee.setFirstName(result.getString(2));
              employee.setLastName(result.getString(3));
              employee.setAge(result.getInt(4));
       	     address.setStreetName(result1.getString(2));
       	     address.setCityName(result1.getString(3));
       	     address.setStateName(result1.getString(4));
       	     address.setPostalCode(result1.getString(5));
       	     employee.setAddress(address);
       	     employeeByID.add(employee);
     	}
     	return employeeByID;
		
		
	}
	
	

}
