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

import edu.mobile.complaint.model.Garbage;
import edu.mobile.complaint.repository.GarbageRepository;

@RestController
@RequestMapping("/api/garbage")
public class GarbageController {

	@Autowired
	private GarbageRepository garbageRepo;
	
	@PostMapping("/create")
	public ResponseEntity<Garbage> createComplaint(@RequestBody Garbage garbage) {
		return new ResponseEntity<Garbage>(garbageRepo.save(garbage), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Garbage> getAllComplaint(Garbage garbage) {
		return garbageRepo.findAll();
	}
	
	@GetMapping("/id/{complaintId}")
	public ResponseEntity<Garbage> getComplaintBycId(@PathVariable("complaintId") String id) {
		return new ResponseEntity<Garbage>(garbageRepo.findByComplaintId(id), HttpStatus.OK);
	}
	
}
