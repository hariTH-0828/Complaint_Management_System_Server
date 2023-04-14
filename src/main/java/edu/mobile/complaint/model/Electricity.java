package edu.mobile.complaint.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electricity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Consumer_Id", nullable = false)
	private int consumerId;
	
	@Column(name = "Issue", nullable = false)
	private String issue;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "Date", nullable = false)
	private String date;
	
	@Column(name = "Priority_level", nullable = false)
	private String priorityLevel;
	
	@Column(name = "Status", nullable = false)
	private String status;
	
	@Column(name = "Complaint_ID", nullable = false, unique = true)
	private String complaintId;

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public long getId() {
		return id;
	}
	
	
}
