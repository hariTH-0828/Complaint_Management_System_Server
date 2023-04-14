package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.Garbage;

public interface GarbageRepository extends JpaRepository<Garbage, Long>{
	Garbage findByComplaintId(String id);
}	
