package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.Water;

public interface WaterRepository extends JpaRepository<Water, Integer>{
	Water findByComplaintId(String id);
}
