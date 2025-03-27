package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employees;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

// read employee by id
	public Employees readEmpById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	// Read all employees
	public List<Employees> readALLEmp() {
		return employeeRepository.findAll();
	}

// create / store the employee
	public Employees onboardEmployee(Employees emp) {
		return employeeRepository.save(emp);
	}

// delete the employee data based on the id

	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Delete employee success";
	}

// update the employee data

	public Employees updateEmployee(Employees emp) {
		return employeeRepository.save(emp);
	}

}
