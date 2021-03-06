package com.cg.restservice.firstspringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.restservice.firstspringBootApp.pojo.Employee;
import com.cg.restservice.firstspringBootApp.repository.EmployeeRepository;


@Service
class EmployeeserviceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public void addNewEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	
	
}
