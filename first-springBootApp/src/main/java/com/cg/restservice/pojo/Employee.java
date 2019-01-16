package com.cg.restservice.pojo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double salary;
	
	@Embedded
	private String address;

	
	public Employee() {
		super();
	}
	
	
	public Employee(int empId, String empName, double salary, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}