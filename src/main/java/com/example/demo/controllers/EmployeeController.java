package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employees;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/emp/byid/{id}")
	public Employees findEmpById(@PathVariable("id") int id) {
		return employeeService.readEmpById(id);
	}

	@GetMapping("/emp/all")
	public List<Employees> findAllEmp() {
		return employeeService.readALLEmp();
	}

	@PostMapping("/emp/onboard")
	public Employees onboardEmp(@RequestBody Employees emp) {
	    return employeeService.onboardEmployee(emp);
	}

	@DeleteMapping("/emp/remove/{id}")
	public String deleteEmp(@PathVariable("id") int id) {
		return employeeService.deleteEmployeeById(id);
	}

	@PutMapping("/emp/update")
	public Employees updateEmployee(@RequestBody Employees emp) {
		return employeeService.updateEmployee(emp);
	}

}
