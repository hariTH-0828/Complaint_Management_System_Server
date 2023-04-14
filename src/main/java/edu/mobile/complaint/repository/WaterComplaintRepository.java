package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.Complaint.WaterComplaint;

public interface WaterComplaintRepository extends JpaRepository<WaterComplaint, Integer> {

}
