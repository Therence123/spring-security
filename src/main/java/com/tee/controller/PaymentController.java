package com.tee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tee.model.Payment;
import com.tee.security.service.PaymentService;

@RestController
@RequestMapping("api/v1/paymentside")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService; 

	
	//Get All Transactions 
//	
//	@PreAuthorize("hasRole('ADMIN')")
//	@GetMapping("/history/{id}/payments")
//	public List<Payment> RetrieveAllPayments(@PathVariable String id){
//		return paymentService.getAllPayments(id);
//	}
//	


	
	
}