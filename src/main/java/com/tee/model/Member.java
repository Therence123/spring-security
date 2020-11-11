package com.tee.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;

import com.tee.IdGenerator.StringPrefixedSequenceIdGenerator;

@Entity
public class Member {

     
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_id")
    @GenericGenerator(
        name = "member_id", 
        strategy = "com.tee.IdGenerator.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "10000"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "JCCCAG_"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
    private String id;    
    private String name;
    private String gender;
    private String email;
    private String gpsAddress;
    private String maritalStatus;
    private String phone1;
    private String phone2;
    private String depatureReason;
    private String status;
    private String memberDoc;
    private String occupation;
    private String branch;
    private String profileImage;
    private String idType;
    private String idNumber;
    
    @CreationTimestamp
    private Date DateAdded;
    
  //  @UpdateTimestamp
    private Date DepatureDate;
    
    @ManyToOne
    private Department department;
    
    
    @OneToMany(mappedBy="id")
    private List<Payment> payment;
    
    
    public Member() {}

	public Member(String name, String gender, String email, String gpsAddress, String maritalStatus, String phone1,
			String phone2, String depatureReason, String status, String memberDoc, String occupation, String branch,
			String profileImage, String idType, String idNumber, Date dateAdded, Date depatureDate,
			Department department, List<Payment> payment) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.gpsAddress = gpsAddress;
		this.maritalStatus = maritalStatus;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.depatureReason = depatureReason;
		this.status = status;
		this.memberDoc = memberDoc;
		this.occupation = occupation;
		this.branch = branch;
		this.profileImage = profileImage;
		this.idType = idType;
		this.idNumber = idNumber;
		DateAdded = dateAdded;
		DepatureDate = depatureDate;
		this.department = department;
		this.payment = payment;
	}



	//Getters and Setters

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone1() {
		return phone1;
	}


	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}


	public String getPhone2() {
		return phone2;
	}


	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGpsAddress() {
		return gpsAddress;
	}


	public void setGpsAddress(String gpsAddress) {
		this.gpsAddress = gpsAddress;
	}


	public String getMaritalStatus() {
		return maritalStatus;
	}


	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDepatureReason() {
		return depatureReason;
	}


	public void setDepatureReason(String depatureReason) {
		this.depatureReason = depatureReason;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getMemberDoc() {
		return memberDoc;
	}


	public void setMemberDoc(String memberDoc) {
		this.memberDoc = memberDoc;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public Date getDateAdded() {
		return DateAdded;
	}


	public void setDateAdded(Date dateAdded) {
		DateAdded = dateAdded;
	}


	public Date getDepatureDate() {
		return DepatureDate;
	}


	public void setDepatureDate(Date depatureDate) {
		DepatureDate = depatureDate;
	}



	public String getIdType() {
		return idType;
	}



	public void setIdType(String idType) {
		this.idType = idType;
	}



	public String getIdNumber() {
		return idNumber;
	}



	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}



	public List<Payment> getPayment() {
		return payment;
	}



	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	
	
    
        
}
