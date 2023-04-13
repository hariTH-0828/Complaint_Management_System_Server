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

import edu.mobile.complaint.model.ElectricityConsumer;
import edu.mobile.complaint.repository.ElectricityConsumerRepository;

@RestController
@RequestMapping("/api/electricity/consumer")
public class ElectricityConsumerController {

	@Autowired
	private ElectricityConsumerRepository electricityConsumerRepo;
	
	@GetMapping("/getAll")
	public List<ElectricityConsumer> getAllConsumers(ElectricityConsumer electricityConsumer) {
		return electricityConsumerRepo.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<ElectricityConsumer> createConsumer(@RequestBody ElectricityConsumer electricityConsumer) {
		return new ResponseEntity<ElectricityConsumer>(electricityConsumerRepo.save(electricityConsumer), HttpStatus.CREATED);
	}
	
	@GetMapping("{consumerNumber}")
	public ResponseEntity<ElectricityConsumer> getIdByConsumerNumber(@PathVariable("consumerNumber") String consumerNumber) {
		return new ResponseEntity<ElectricityConsumer>(electricityConsumerRepo.findByConsumerNumber(consumerNumber), HttpStatus.OK);
	}
}
