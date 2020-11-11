package com.tee.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tee.IdGenerator.StringPrefixedSequenceIdGenerator;

@Entity
public class Payment {

       @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_ref")
	   @GenericGenerator(
		        name = "payment_ref", 
		        strategy = "com.tee.IdGenerator.StringPrefixedSequenceIdGenerator", 
		        parameters = {
		            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "10000"),
		            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "PTRNX_"),
		            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	   private String paymentRef;
	   
	   private float paymentAmount;
	   
	   private String paymentReason;
	   
	   private String paymentCcy;
	   
	   @CreationTimestamp
	   private Date paymentDate;
	   
	   private Date paymentForWhen;
	   
	   private String paymentStatus;
	   
       @CreatedBy
	   private String LoggedBy;
       
   
       @ManyToOne
       @JoinColumn(name="id")
       private Member id;
       

	public Payment() {}

	public Payment(float paymentAmount, String paymentReason, String paymentCcy, Date paymentDate, Date paymentForWhen,
			String paymentStatus, String loggedBy, Member id) {
		this.paymentAmount = paymentAmount;
		this.paymentReason = paymentReason;
		this.paymentCcy = paymentCcy;
		this.paymentDate = paymentDate;
		this.paymentForWhen = paymentForWhen;
		this.paymentStatus = paymentStatus;
		LoggedBy = loggedBy;
		     this.id=id;
	}


	public String getPaymentRef() {
		return paymentRef;
	}


	public void setPaymentREf(String paymentRef) {
		this.paymentRef = paymentRef;
	}


	public float getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


	public String getPaymentReason() {
		return paymentReason;
	}


	public void setPaymentReason(String paymentReason) {
		this.paymentReason = paymentReason;
	}


	public String getPaymentCcy() {
		return paymentCcy;
	}


	public void setPaymentCcy(String paymentCcy) {
		this.paymentCcy = paymentCcy;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public String getLoggedBy() {
		return LoggedBy;
	}


	public void setLoggedBy(String loggedBy) {
		LoggedBy = loggedBy;
	}


	public Date getPaymentForWhen() {
		return paymentForWhen;
	}


	public void setPaymentForWhen(Date paymentForWhen) {
		this.paymentForWhen = paymentForWhen;
	}

	@JsonIgnore
	public Member getId() {
		return id;
	}

	public void setId(Member id) {
		this.id = id;
	}   
	
       
	   
}
