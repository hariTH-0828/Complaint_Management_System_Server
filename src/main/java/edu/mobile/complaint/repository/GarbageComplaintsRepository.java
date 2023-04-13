package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.GarbageComplaints;

public interface GarbageComplaintsRepository extends JpaRepository<GarbageComplaints, Integer>{
}
