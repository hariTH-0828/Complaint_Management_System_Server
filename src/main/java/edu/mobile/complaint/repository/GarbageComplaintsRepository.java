package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.Complaint.GarbageComplaint;

public interface GarbageComplaintsRepository extends JpaRepository<GarbageComplaint, Integer>{
}
