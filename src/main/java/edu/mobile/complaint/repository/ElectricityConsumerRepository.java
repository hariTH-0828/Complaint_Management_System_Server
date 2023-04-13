package edu.mobile.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mobile.complaint.model.ElectricityConsumer;

public interface ElectricityConsumerRepository extends JpaRepository<ElectricityConsumer, Integer>{

}
