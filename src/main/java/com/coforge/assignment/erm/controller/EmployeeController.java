package com.coforge.assignment.erm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.assignment.erm.model.Employee;
import com.coforge.assignment.erm.service.EmployeeService;


@Controller
@RequestMapping("/employee")//Class level Mapping
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/showform") //Method Level Mapping
	public String showFormForAdd(ModelMap theModel) {
		Employee theEmployee=new Employee();
		theModel.addAttribute("employee",theEmployee);//Return View & Customer Object
		
		return "employee-form";
	}
		@PostMapping("/saveEmployee")
		public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
			employeeService.saveEmployee(theEmployee);
			
			return "redirect:/employee/list";
		}
		
		@GetMapping("/list") //@GetMapping-method level,default get method
		public String listEmployees(ModelMap theModel) {
			List<Employee> theEmployees=employeeService.getEmployees();
			theModel.addAttribute("employees", theEmployees);
			
			return "list-employees";
		}
		
		@GetMapping("/updateForm")
		public String showFormForUpdate(@RequestParam("employeeId") int theId,ModelMap theModel) {
			
			Employee theEmployee = employeeService.getEmployee(theId);
			theModel.addAttribute("employee", theEmployee);
			return "employee-form";
			
			
		}
		
		@GetMapping("/delete")
		public String deleteEmployee(@RequestParam("employeeId") int theId,ModelMap theModel) {
			employeeService.deleteEmployee(theId);
			return "redirect:/employee/list";
			
			
		}
		
		
			



}
	
	
	
	
	
	
