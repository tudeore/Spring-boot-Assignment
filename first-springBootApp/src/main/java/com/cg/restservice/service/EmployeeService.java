package com.cg.restservice.service;

import java.util.List;

import com.cg.restservice.pojo.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();



}
