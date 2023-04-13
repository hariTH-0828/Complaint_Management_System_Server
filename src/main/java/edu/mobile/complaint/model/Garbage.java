package edu.mobile.complaint.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Garbage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Issue", nullable = false)
	private String problems;
	
	@Column(name = "Query")
	private String query;
	
	@Column(name = "Phone_number", nullable = false)
	private String phoneNumber;
	
	@Column(name = "Address", nullable = false)
	private String address;
	
	@Column(name = "Pincode", nullable = false)
	private String pincode;
	
	@Column(name = "State_ID", nullable = false)
	private int stateId;
	
	@Column(name = "District_ID", nullable = false)
	private int districtId;
	
	@Column(name = "Priority_level", nullable = false)
	private String priorityLevel;
	
	@Column(name = "DateOfRegistration", nullable = false)
	private String date;
	
	@Column(name = "Status", nullable = false)
	private String status;
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "fk_photoId", referencedColumnName = "id") private
	 * ImageDataInfo photoId;
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*
	 * public ImageDataInfo getPhotoId() { return photoId; }
	 * 
	 * public void setPhotoId(ImageDataInfo photoId) { this.photoId = photoId; }
	 */

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public long getId() {
		return id;
	}
	
	
}
