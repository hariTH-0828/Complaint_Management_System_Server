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

import edu.mobile.complaint.model.GarbageComplaints;
import edu.mobile.complaint.repository.GarbageComplaintsRepository;

@RestController
@RequestMapping("/api/garbage/complaint")
public class GarbageComplaintsController {
	
	@Autowired
	private GarbageComplaintsRepository garbageComplaintsRepo;
	
	@GetMapping("/getAll")
	public List<GarbageComplaints> getAllComplaints(GarbageComplaints garbageComplaints) {
		return garbageComplaintsRepo.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<GarbageComplaints> createIssue(@RequestBody GarbageComplaints garbageComplaints) {
		return new ResponseEntity<GarbageComplaints>(garbageComplaintsRepo.save(garbageComplaints), HttpStatus.CREATED);
	}

}
