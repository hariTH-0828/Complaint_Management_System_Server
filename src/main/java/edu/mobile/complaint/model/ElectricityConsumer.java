package edu.mobile.complaint.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ElectricityConsumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Name", nullable = false)
	private String consumerName;
	
	@Column(name = "Consumer_number", nullable = false, unique = true)
	private String consumerNumber;
	
	@Column(name = "PhoneNumber", nullable = false)
	private String consumerPhoneNumber;
	
	@Column(name = "AadhaarNumber", nullable = false)
	private String consumerAadhaarNumber;
	
	@Column(name = "Address", nullable = false)
	private String consumerAddress;

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public String getConsumerPhoneNumber() {
		return consumerPhoneNumber;
	}

	public void setConsumerPhoneNumber(String consumerPhoneNumber) {
		this.consumerPhoneNumber = consumerPhoneNumber;
	}

	public String getConsumerAadhaarNumber() {
		return consumerAadhaarNumber;
	}

	public void setConsumerAadhaarNumber(String consumerAadhaarNumber) {
		this.consumerAadhaarNumber = consumerAadhaarNumber;
	}

	public String getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public int getId() {
		return id;
	}
	
	
}
