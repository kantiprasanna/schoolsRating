package com.example.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.entity.School;
import com.example.school.exception.ResourceNotFoundException;
import com.example.school.repository.SchoolRepository;


@RestController
@RequestMapping("/api/schools")
public class SchoolController {

	@Autowired
	private SchoolRepository schoolRepository;

	// get all Schools
	@GetMapping
	public List<School> getAllSchools() {
		return this.schoolRepository.findAll();
	}

	// get School by id
	@GetMapping("/{id}")
	public School getSchoolById(@PathVariable (value = "id") Long SchoolId) {
		return this.schoolRepository.findById(SchoolId)
				.orElseThrow(() -> new ResourceNotFoundException("School not found with id :" + SchoolId));
	}

	// create School
	@PostMapping
	public School createSchool(@RequestBody School School) {
		return this.schoolRepository.save(School);
	}
	
	// update School
	@PutMapping("/{id}")
	public School updateSchool(@RequestBody School School, @PathVariable ("id") long SchoolId) {
		 School existingSchool = this.schoolRepository.findById(SchoolId)
			.orElseThrow(() -> new ResourceNotFoundException("School not found with id :" + SchoolId));
		 existingSchool.setSchoolName(School.getSchoolName());
		 existingSchool.setSchoolAddress(School.getSchoolAddress());
		 existingSchool.setSchoolPhoneNumber(School.getSchoolPhoneNumber());
		 return this.schoolRepository.save(existingSchool);
	}
	
	// delete School by id
	@DeleteMapping("/{id}")
	public ResponseEntity<School> deleteSchool(@PathVariable ("id") long SchoolId){
		 School existingSchool = this.schoolRepository.findById(SchoolId)
					.orElseThrow(() -> new ResourceNotFoundException("School not found with id :" + SchoolId));
		 this.schoolRepository.delete(existingSchool);
		 return ResponseEntity.ok().build();
	}
}
