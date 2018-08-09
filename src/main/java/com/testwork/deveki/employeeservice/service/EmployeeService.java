package com.testwork.deveki.employeeservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testwork.deveki.employeeservice.dao.EmployeeDao;
import com.testwork.deveki.employeeservice.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;
	
	public Employee getEmployee(Integer id) {
		return empDao.findById(id).get();
	}
	
	public Employee saveEmployee(Employee emp) {
		return empDao.save(emp);
	}
	
	public boolean deleteEmployee(Integer id) {
		boolean deleted = true;
		try {
			empDao.deleteById(id);
		}catch(Exception e) {
			deleted  = false;
		}
		return deleted;
	}
	
	public List<Employee> getAll(){
		List<Employee> emps = new ArrayList<>();
		Iterable<Employee> itrTemp = empDao.findAll();
		Iterator<Employee> itr = null;
		if(itrTemp != null) {
			itr = itrTemp.iterator();
		}
		
		if(itr != null) {
			while(itr.hasNext()) {
				emps.add(itr.next());
			}
		}
		
		return emps;
	}
 	
	
	
}
