package com.stg.dao;

import java.util.List;

import com.stg.model.Employee;

public interface EmployeeDao {

	public Employee create(Employee employee);

	public List<Employee> readAll();
	
	public Employee update(int empId ,String empName);
	
	public String delete(int empId);

}
