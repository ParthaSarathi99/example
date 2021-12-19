package com.coforge.assignment.erm.dao;

import java.util.List;

import com.coforge.assignment.erm.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee theEmployee);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int theId);
    
	public void deleteEmployee(int theId);
	
	
	

}
