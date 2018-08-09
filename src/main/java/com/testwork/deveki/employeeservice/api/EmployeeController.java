package com.testwork.deveki.employeeservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testwork.deveki.employeeservice.model.Employee;
import com.testwork.deveki.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") String id) {
		System.out.println("Inside getEmployee method of EmployeeController with id : "+id);
		return empService.getEmployee(Integer.parseInt(id));
	}  
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		System.out.println("Inside getAllEmployees method of EmployeeController.");
		return empService.getAll();
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee emp) {
		System.out.println("Inside save method of EmployeeController with name : "+emp.getName()+"  email : "+emp.getEmail());
		return empService.saveEmployee(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable("id") String id) {
		System.out.println("Inside deleteEmployee method of EmployeeController with id : "+id);
		return empService.deleteEmployee(Integer.parseInt(id));
	} 
	
}
