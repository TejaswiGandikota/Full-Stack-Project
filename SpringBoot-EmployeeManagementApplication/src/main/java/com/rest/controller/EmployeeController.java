package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.EmployeeModel;
import com.rest.service.EmployeeServiceImpl;

@RestController	
@RequestMapping("/api/v1/")
@CrossOrigin(origins = {"http://localhost:5173/"})
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	// add employee rest api
	@PostMapping("/employees")
	public EmployeeModel addEmp(@RequestBody EmployeeModel employee)
	{
		EmployeeModel emp=empServiceImpl.saveEmployee(employee);
		return emp;
	}
	// get all employees
	@GetMapping("/employees")
	public List<EmployeeModel> allEmployeeDetails()
	{
		List<EmployeeModel> getData = empServiceImpl.getAllEmp();
		return getData;
	}
	
	// update one employee
	@PutMapping("/employees/{id}")
	public EmployeeModel updateOneRecord(@PathVariable Long id, @RequestBody EmployeeModel employee)
	{
		EmployeeModel updateData = empServiceImpl.updateEmployee(id,employee);
		return updateData;
	}
	
	@GetMapping("/employees/{id}")
	public EmployeeModel getRecord(@PathVariable Long id)
	{
	    EmployeeModel getOneData = empServiceImpl.getOneEmployee(id);
		return getOneData;
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id)
	{
		empServiceImpl. deleteOneEmployee(id);
	
	}
}
