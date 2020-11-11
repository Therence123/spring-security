package com.tee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tee.model.Role;
import com.tee.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>{

	 Optional<Role> findByName(RoleName roleName);
}
