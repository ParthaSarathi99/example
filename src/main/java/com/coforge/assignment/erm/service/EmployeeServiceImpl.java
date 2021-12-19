package com.coforge.assignment.erm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.assignment.erm.dao.EmployeeDao;
import com.coforge.assignment.erm.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {

      employeeDao.saveEmployee(theEmployee);
		
		
		
	}

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDao.getEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		
		return employeeDao.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {

      employeeDao.deleteEmployee(theId);
		
	}

}
