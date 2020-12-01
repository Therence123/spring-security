package com.tee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tee.model.Member;
import com.tee.security.service.MemberService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/v1/memberside")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	//get all members
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/memberlist")
	public List<Member> ReturnAllMembers(){
		return memberService.getListOfMembers();
	}
	
	//Get a member by Id
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@GetMapping("/membercode/{id}")
	public Member getMemberDetailsById(@PathVariable String id) {
		return memberService.getMemberById(id);
	}
	
	
	//Get a member by name
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')") 
	@GetMapping("/member/{Name}")
    public Member getMemberInfoByName(@PathVariable String Name) {
    	return memberService.getMemberByName(Name);
    } 
	
	//Register a new member
//	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")	
	@PostMapping("/register-new")
	public Member registerNewMember(@RequestBody Member member) {
		return memberService.addNewMember(member);
	}
	
	//Register Bulk Members
	@PostMapping("/register-bulk-users")
	public List<Member> addLoans(@RequestBody List<Member> members) {
		  return memberService.saveLoans(members);
		}
	
	//Update a member's details
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")	
	@PutMapping("/edit/{id}")
	public Member updateMember(@RequestBody Member member) {
		return memberService.updateMember(member);
	}
	
	
	
}
