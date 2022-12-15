package com.example.employee.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employee.model.*;
import com.example.employee.repo.*;
import com.example.employee.exception.*;


@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private Employeerepo employeerepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeerepo.findAll();
	}		
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeerepo.save(employee);
	}
}

