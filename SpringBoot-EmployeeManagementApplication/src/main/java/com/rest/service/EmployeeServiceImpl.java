package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.EmployeeModel;
import com.rest.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public EmployeeModel saveEmployee(EmployeeModel employee) {
		
		EmployeeModel saveData=empRepo.save(employee);
		return saveData;
	}

	@Override
	public List<EmployeeModel> getAllEmp() {
		List<EmployeeModel> get = empRepo.findAll();
		return get;
	}

	@Override
	public EmployeeModel updateEmployee(Long id, EmployeeModel employee) {
		
		EmployeeModel getOneRecord = empRepo.findById(id).get();
		getOneRecord.setName(employee.getName());
		getOneRecord.setEmail(employee.getEmail());
		getOneRecord.setGender(employee.getGender());
		getOneRecord.setDeptno(employee.getDeptno());
		
		return  empRepo.save(getOneRecord);
	}

	@Override
	public EmployeeModel getOneEmployee(Long id) {
		
		EmployeeModel getOne = empRepo.findById(id).get();
		return getOne;
	}

	@Override
	public void deleteOneEmployee(Long id) {
		
		empRepo.deleteById(id);
		
	}

	

}
