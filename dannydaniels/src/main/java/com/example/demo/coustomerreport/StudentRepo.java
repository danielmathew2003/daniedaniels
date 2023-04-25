package com.example.demo.coustomerreport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.coustomerdetails.java.StudentsDetails;

@Repository
public interface StudentRepo extends JpaRepository <StudentsDetails, Integer>{
	

}
