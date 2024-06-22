package com.rest.service;

import java.util.List;

import com.rest.model.EmployeeModel;

public interface EmployeeService {

	// add employee
	public EmployeeModel saveEmployee(EmployeeModel employee);
	// get all details
	public List<EmployeeModel> getAllEmp();
	// update one Employee details
	public EmployeeModel updateEmployee(Long id,EmployeeModel employee);
	
	// get one record employee details
	public EmployeeModel getOneEmployee(Long id);
	 // delete employee
	public void deleteOneEmployee (Long id);
}
