package com.basic.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.basic.entity.EmployeeModel;
import com.basic.repo.EmployeeRepo;
import com.basic.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping("/getEmployee")
	public List<EmployeeModel> getAllEmployee(){
		System.out.println(service.GetEmployees());
		return service.GetEmployees();
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void DeleteMapping(@PathVariable Long id) {
		System.out.println(id);
	repo.deleteById(id);
	}
	
	@PostMapping("/insertEmployee")
	public void insertEmployee(@RequestBody EmployeeModel emp) {
		System.out.println(emp);
		repo.save(emp);
	}
	
	@PutMapping("/updateEmployee")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel emp) {
		System.out.println(emp);
		repo.save(emp);
		return emp;
	}
	
	
}
