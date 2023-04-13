package edu.mobile.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mobile.complaint.Complaint.ElectricityComplaint;
import edu.mobile.complaint.repository.ElectricityCompliantRepository;

@RestController
@RequestMapping("/api/electricity/complaint")
public class ElectricityCompliantController {
	
	@Autowired
	private ElectricityCompliantRepository electricityCompliantRepo;

	
	@GetMapping("/getAll")
	public List<ElectricityComplaint> getAllComplaints(ElectricityComplaint electricityComplaint) {
		return electricityCompliantRepo.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<ElectricityComplaint> createComplaint(@RequestBody ElectricityComplaint electricityComplaint) {
		return new ResponseEntity<ElectricityComplaint>(electricityCompliantRepo.save(electricityComplaint), HttpStatus.CREATED);
	}
}
