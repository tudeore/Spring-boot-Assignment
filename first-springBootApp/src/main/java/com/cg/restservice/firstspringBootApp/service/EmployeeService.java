package com.cg.restservice.firstspringBootApp.service;

import java.util.List;

import com.cg.restservice.firstspringBootApp.pojo.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();



}
