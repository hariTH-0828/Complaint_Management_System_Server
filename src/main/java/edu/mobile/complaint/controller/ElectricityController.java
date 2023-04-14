package edu.mobile.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mobile.complaint.model.Electricity;
import edu.mobile.complaint.repository.ElectricityRepository;

@RestController
@RequestMapping("/api/electricity")
public class ElectricityController {

	@Autowired
	private ElectricityRepository electricityRepo;
	
	@GetMapping("/getAll")
	public List<Electricity> getAllComplaints() {
		return electricityRepo.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<Electricity> createConsumerComplaint(@RequestBody Electricity electricity) {
		return new ResponseEntity<Electricity>(electricityRepo.save(electricity), HttpStatus.CREATED);
	}
	
	@GetMapping("/id/{complaintId}")
	public ResponseEntity<Electricity> getComplaintBycId(@PathVariable("complaintId") String id) {
		return new ResponseEntity<Electricity>(electricityRepo.findByComplaintId(id), HttpStatus.OK);
	}
}
