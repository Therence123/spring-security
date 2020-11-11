package com.tee.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tee.model.Payment;
import com.tee.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepo;
	
	
	// Get all payments
	
	public List<Payment> getAllPayments(String memberid){
		List<Payment> payments = new ArrayList<>();
		 paymentRepo.findById(memberid)
		 .forEach(payments::add);
		 
		 return payments;
	}
	
			

	
}
