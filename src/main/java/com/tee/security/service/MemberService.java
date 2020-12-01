package com.tee.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tee.model.Member;
import com.tee.repository.MemberRepository;

@Service
public class MemberService {

	
	@Autowired
	private MemberRepository repo;
	
	
	 //Return a list of all members
    
    public List<Member> getListOfMembers() {
    	return repo.findAll();
    }
    
    //Get a member by id
    public Member getMemberById(String id) {
    	return repo.findById(id).orElse(null);
    }
	
    //Get member by name
    
    public Member getMemberByName(String name) {
      	
      	return repo.findByName(name);
      }
    
    //Add a member
    public Member addNewMember(Member member) {
    	return repo.save(member);
    }
    
    //Add bulk members
 public List<Member> saveLoans(List<Member> members) {
    	
    	return repo.saveAll(members);
    }
    
    
    //Update a member's detail
    public Member updateMember(Member member) {
    	Member existing = repo.findById(member.getId()).orElse(null);
    	existing.setName(member.getName());
    	existing.setGender(member.getGender());
    	existing.setEmail(member.getEmail());
    	existing.setBranch(member.getBranch());
    	existing.setGpsAddress(member.getGpsAddress());
    	existing.setMaritalStatus(member.getMaritalStatus());
    	existing.setOccupation(member.getOccupation());
    	existing.setDepatureDate(member.getDepatureDate());
    	existing.setStatus(member.getStatus());
    	existing.setPhone1(member.getPhone1());
    	existing.setPhone2(member.getPhone2());
    	existing.setProfileImage(member.getProfileImage());
    	existing.setIdType(member.getIdType());
    	existing.setIdNumber(member.getIdNumber());
    	existing.setPayment(member.getPayment());
    	
    	return repo.save(existing);
    }
	
	
}
