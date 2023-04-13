package edu.mobile.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mobile.complaint.exception.ResourceNotFound;
import edu.mobile.complaint.model.District;
import edu.mobile.complaint.repository.DistrictRepository;

@RestController
@RequestMapping("/api/district")
public class DistrictController {
	
	@Autowired
	private DistrictRepository districtRepository;

	@GetMapping("/getAll")
	public List<District> getAllDistrict(District district) {
		return districtRepository.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<District> getDistrictById(@PathVariable("id") int id) {
		return new ResponseEntity<District>(districtRepository.findById(id).orElseThrow(() -> new ResourceNotFound("District", "id", id)), HttpStatus.OK);
	}
	
	@GetMapping("state/{id}")
	public List<District> getDistrictByStateId(@PathVariable("id")int id){
		return districtRepository.findByStateId(id);
	}
	
}