package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.employee.EmployeeDetailsRequest;
import com.example.employee.EmployeeDetailsResponse;

@Endpoint
public class EmployeeEndpoint {

	private static final String NAMESPACE_URI = "http://www.example.com/employee";

	@Autowired
	private EmployeeService employeeService;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeDetailsRequest")
	@ResponsePayload
	public EmployeeDetailsResponse getStudent(@RequestPayload EmployeeDetailsRequest request) {
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();
		response.setEmployee(employeeService.getEmployee(request.getId()));
		return response;
	}
}

