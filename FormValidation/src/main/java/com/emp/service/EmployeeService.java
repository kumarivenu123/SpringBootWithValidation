package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.respository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Boolean addEmployee(Employee employee) {
		Boolean flag;
		Employee emp = employeeRepository.save(employee);
		if (emp != null) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
