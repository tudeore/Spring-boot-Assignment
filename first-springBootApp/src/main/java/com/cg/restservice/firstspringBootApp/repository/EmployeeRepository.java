package com.cg.restservice.firstspringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.restservice.firstspringBootApp.pojo.Employee;

@Repository																				//functional interface
public interface EmployeeRepository extends JpaRepository<Employee,Integer> { 			//spring data

}
