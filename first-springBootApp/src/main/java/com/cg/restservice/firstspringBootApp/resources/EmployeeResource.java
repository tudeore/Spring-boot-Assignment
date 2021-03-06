package com.cg.restservice.firstspringBootApp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restservice.firstspringBootApp.pojo.Employee;
import com.cg.restservice.firstspringBootApp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public void addNewemployee(@RequestBody Employee employee) {
		
		service.addNewEmployee(employee);
	}
	
//	@RequestMapping(method = RequestMethod.GET,
//			produces = {"application/json","application/xml"})
	@GetMapping
	public List<Employee>getAllEmployees(){
		
		return service.getAllEmployees();
	}
}
