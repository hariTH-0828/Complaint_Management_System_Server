package edu.mobile.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.District;

public interface DistrictRepository extends JpaRepository<District, Integer>{
	List<District> findByStateId(int stateId);
}
