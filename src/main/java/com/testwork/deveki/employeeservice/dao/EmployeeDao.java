package com.testwork.deveki.employeeservice.dao;

import org.springframework.stereotype.Repository;

import com.testwork.deveki.employeeservice.model.Employee;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
}