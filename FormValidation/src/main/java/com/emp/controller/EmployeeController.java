package com.emp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/emp/register")
	public ResponseEntity<String> validateEmp(@Valid @RequestBody Employee employee) {

		Boolean result = employeeService.addEmployee(employee);
		
		String returnResposne;
		
		if(result) {
			returnResposne="Successfully inserted...";
		}
		else {
			returnResposne = "Faild to insert";
		}

		return new ResponseEntity<>(returnResposne ,HttpStatus.OK);
	}

}
