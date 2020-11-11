package com.tee.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tee.model.Department;
import com.tee.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository deprepo;
	
	
	//Add a department
	public Department addNewDepartment(Department department) {
		return deprepo.save(department);
	}
	
       //Return a list of all departments
    
    public List<Department> getListOfDepartments() {
    	return deprepo.findAll();
    }
	
}
