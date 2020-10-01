package com.example.demo;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.employee.Employee;

@Component
public class EmployeeService {

	private static final Map<String, Employee> employeeMap = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Employee employee = new Employee();
		employee.setName("X");
		employee.setId("1");
		employee.setAddress("Kolkata");
		employeeMap.put(employee.getId(), employee);
		
		employee = new Employee();
		employee.setName("Y");
		employee.setId("2");
		employee.setAddress("Pune");
		employeeMap.put(employee.getId(), employee);		
		
	}

	public Employee getEmployee(String id) {
		return employeeMap.get(id);
	}
}
