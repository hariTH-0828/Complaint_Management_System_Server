package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.States;

public interface StatesRepository extends JpaRepository<States, Integer> {
	States findByState(String stateName);
}
