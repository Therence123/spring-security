package com.tee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tee.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{
	
         Member findByName(String name);
         
}
