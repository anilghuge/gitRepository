package com.basic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.basic.entity.EmployeeModel;
import com.basic.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<EmployeeModel> GetEmployees(){
		return repo.findAll(); 
	}
	
	

}
