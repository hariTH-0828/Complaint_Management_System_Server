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

import edu.mobile.complaint.Complaint.WaterComplaint;
import edu.mobile.complaint.repository.WaterComplaintRepository;

@RestController
@RequestMapping("/api/water/complaint")
public class WaterComplaintController {

	@Autowired
	private WaterComplaintRepository waterComplaintRepo;
	
	@GetMapping("/getAll")
	public List<WaterComplaint> getAllComplaintType(WaterComplaint waterComplaint) {
		return waterComplaintRepo.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<WaterComplaint> createComplaintType(@RequestBody WaterComplaint waterComplaint) {
		return new ResponseEntity<WaterComplaint>(waterComplaintRepo.save(waterComplaint), HttpStatus.CREATED);
	}
}
