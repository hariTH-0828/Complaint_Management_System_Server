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

import edu.mobile.complaint.model.Water;
import edu.mobile.complaint.repository.WaterRepository;

@RestController
@RequestMapping("/api/water")
public class WaterController {

	@Autowired
	private WaterRepository waterRepository;
	
	@GetMapping("/getAll")
	public List<Water> getAllComplaints() {
		return waterRepository.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<Water> createComplaint(@RequestBody Water water) {
		return new ResponseEntity<Water>(waterRepository.save(water), HttpStatus.CREATED);
	}
}
