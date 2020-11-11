package com.tee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tee.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

	
	//get list of payment by member id
	public List<Payment> findById(String id);

  
}
