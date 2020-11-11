package com.tee.model;

import java.util.List;

import javax.persistence.*;
@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String DepartmentName;
	private String Description;
	
	@OneToMany(mappedBy="department")
	private List<Member> members;
	
	
	
	public Department() {}
	
	//constructor
	
	public Department(String departmentName, String description) {
		DepartmentName = departmentName;
		Description = description;
	}


	//getters and setters
	public String getDepartmentName() {
		return DepartmentName;
	}


	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
	
	

}
