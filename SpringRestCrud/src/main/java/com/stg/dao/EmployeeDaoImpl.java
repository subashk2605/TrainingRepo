package com.stg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stg.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

//	Employee employee1 = new Employee(111, "One", 20000.0f);
//	Employee employee2 = new Employee(222, "Two", 50000.0f);
//	Employee employee3 = new Employee(333, "Three", 80000.0f);
//	List<Employee> employees = new ArrayList<>();
//	employees.add(employee1);
//	employees.add(employee2);
//	employees.add(employee3);

	public static List<Employee> employees = new ArrayList<Employee>();

	@Override
	public Employee create(Employee employee) {
		if (employee != null) {
			employees.add(employee);
		}
		return employee;
	}

	@Override
	public List<Employee> readAll() {

		return employees;
	}

	@Override
	public Employee update(int empId, String empName) {
		Employee employee = null;
		if (employees != null) {
			for (Employee i : employees) {
				if (i.getEmpNo() == empId) {
					i.setEmpName(empName);
					employee = i;
				}
			}
		}
		return employee;
	}

	@Override
	public String delete(int empId) {
		if (employees != null) {
			employees.removeIf(i -> i.getEmpNo() == empId);

		}
		return "Data removed Sucessfully";
	}

}
