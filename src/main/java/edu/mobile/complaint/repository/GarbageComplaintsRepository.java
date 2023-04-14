package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.Complaint.GarbageComplaints;

public interface GarbageComplaintsRepository extends JpaRepository<GarbageComplaints, Integer>{
}
