package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Employee;
import com.stg.service.EmployeeServiceImpl;

@RestController
public class AppController {

	@Autowired
	private EmployeeServiceImpl serviceImpl;

	@RequestMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {

		return serviceImpl.create(employee);
	}

	@RequestMapping(value = "read")
	public List<Employee> readAll() {

		return serviceImpl.readAll();

	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public Employee update(@RequestParam int empId, @RequestParam String empName) {

		return serviceImpl.update(empId, empName);

	}

	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public String delete(@RequestParam int empId) {

		return serviceImpl.delete(empId);

	}

}
