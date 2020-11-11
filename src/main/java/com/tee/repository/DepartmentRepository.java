package com.tee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tee.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
 
}
