package com.example.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.model.HR;

@Repository
public interface HrRepository extends JpaRepository<HR,Long>{

}
