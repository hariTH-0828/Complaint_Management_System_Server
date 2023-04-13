package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.Complaint.ElectricityComplaint;

public interface ElectricityCompliantRepository extends JpaRepository<ElectricityComplaint, Integer> {

}
