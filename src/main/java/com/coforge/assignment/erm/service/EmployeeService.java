package com.coforge.assignment.erm.service;

import java.util.List;

import com.coforge.assignment.erm.model.Employee;

public interface EmployeeService {

    public void saveEmployee(Employee theEmployee);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int theId);
    
	public void deleteEmployee(int theId);
	
	
}
