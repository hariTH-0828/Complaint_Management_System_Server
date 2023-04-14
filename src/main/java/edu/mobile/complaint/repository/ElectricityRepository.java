package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.Electricity;

public interface ElectricityRepository extends JpaRepository<Electricity, Long>{
	Electricity findByComplaintId(String id);
}
