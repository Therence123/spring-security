package com.tee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tee.model.Department;
import com.tee.security.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/departmentals")
public class DepartmentController {
	
	@Autowired
	private DepartmentService depService;

	//create a new department
	@PreAuthorize("hasRole('ADMIN')") 
	@PostMapping("/new")
	public Department createNewDepartment(@RequestBody Department department) {
		return depService.addNewDepartment(department);
	}
	
	//return list of all departments
	@PreAuthorize("hasRole('ADMIN')") 
	@GetMapping("/alldepartments")
	public List<Department> getAllDepartments(){
		return depService.getListOfDepartments();
	}
	
}
