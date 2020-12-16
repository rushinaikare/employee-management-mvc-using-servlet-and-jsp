package com.em.bean;

public class Employee {
	private int E_ID;
	private String FirstName;
	private String LastName;
	private int Age;
	private Address address;

	public Employee(String FirstName, String LastName, int Age) {

		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
	}
 
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int E_ID, String FirstName, String LastName, int Age) {
        this.E_ID = E_ID;        
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
	}

	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getE_ID() {
		return E_ID;
	}

	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
