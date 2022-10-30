package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.dao.EmployeeDaoImpl;
import com.stg.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDaoImpl daoImpl;

	@Override
	public Employee create(Employee employee) {

		return daoImpl.create(employee);
	}

	@Override
	public List<Employee> readAll() {

		return daoImpl.readAll();
	}

	@Override
	public Employee update(int empId, String empName) {
		
		return daoImpl.update(empId, empName);
	}

	@Override
	public String delete(int empId) {
		
		return daoImpl.delete(empId);
	}
	
	
	
	
	

}
