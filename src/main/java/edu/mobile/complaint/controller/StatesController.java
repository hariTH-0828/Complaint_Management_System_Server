package edu.mobile.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mobile.complaint.model.States;
import edu.mobile.complaint.repository.StatesRepository;
import edu.mobile.complaint.exception.*;

@RestController
@RequestMapping("/api/states")
public class StatesController {

	@Autowired
	private StatesRepository statesRepository;
	
	@GetMapping("/getAll")
	public List<States> getAllStates(States states){
		return statesRepository.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<States> getStatesById(@PathVariable("id") int id) {
		return new ResponseEntity<States>(statesRepository.findById(id).orElseThrow(() -> new ResourceNotFound("States", "id", id)), HttpStatus.OK);
	}
	
}