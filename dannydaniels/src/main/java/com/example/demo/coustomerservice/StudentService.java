package com.example.demo.coustomerservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.coustomerdetails.java.StudentsDetails;
import com.example.demo.coustomerreport.StudentRepo;

public class StudentService {
	@Autowired
	StudentRepo repository;

	public String addCustomer(StudentsDetails student) {
		repository.save(student);
		return "Added";	
	}
	public List<StudentsDetails> getCustomer()
	{
		
		return repository.findAll();
	}
	public Optional<StudentsDetails>getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String upadateStudentdetails(StudentsDetails student)
	{
		repository.save(student);
		return "updated";
		
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}

}
