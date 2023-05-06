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

import com.example.school.entity.SchoolFeatures;
import com.example.school.exception.ResourceNotFoundException;
import com.example.school.repository.SchoolFeaturesRepository;


@RestController
@RequestMapping("/api/schools")
public class SchoolFeaturesController {

	@Autowired
	private SchoolFeaturesRepository SchoolFeaturesRepository;

	// get all Schools
	@GetMapping
	public List<SchoolFeatures> getAllSchoolFeatures() {
		return this.SchoolFeaturesRepository.findAll();
	}

	// get SchoolFeatures by id
	@GetMapping("/{id}")
	public SchoolFeatures getSchoolFeaturesById(@PathVariable (value = "id") Long SchoolFeaturesId) {
		return this.SchoolFeaturesRepository.findById(SchoolFeaturesId)
				.orElseThrow(() -> new ResourceNotFoundException("SchoolFeatures not found with id :" + SchoolFeaturesId));
	}

	// create SchoolFeatures
	@PostMapping
	public SchoolFeatures createSchoolFeatures(@RequestBody SchoolFeatures SchoolFeatures) {
		return this.SchoolFeaturesRepository.save(SchoolFeatures);
	}
	
	// update SchoolFeatures
	@PutMapping("/{id}")
	public SchoolFeatures updateSchoolFeatures(@RequestBody SchoolFeatures SchoolFeatures, @PathVariable ("id") long SchoolFeaturesId) {
		 SchoolFeatures existingSchoolFeatures = this.SchoolFeaturesRepository.findById(SchoolFeaturesId)
			.orElseThrow(() -> new ResourceNotFoundException("SchoolFeatures not found with id :" + SchoolFeaturesId));
		 existingSchoolFeatures.setTransportation(SchoolFeatures.getTransportation());
		 existingSchoolFeatures.setSports(SchoolFeatures.getSports());
		 existingSchoolFeatures.setBoard(SchoolFeatures.getBoard());
		 existingSchoolFeatures.setIIT(SchoolFeatures.getIIT());
		 existingSchoolFeatures.setNEET(SchoolFeatures.getNEET());
		 existingSchoolFeatures.setTimings(SchoolFeatures.getTimings());
		 existingSchoolFeatures.setFee(SchoolFeatures.getFee());
		 existingSchoolFeatures.setCulturalActivies(SchoolFeatures.getCulturalActivies());
		 existingSchoolFeatures.setExtraCircullarActivies(SchoolFeatures.getExtraCircullarActivies());
		 return this.SchoolFeaturesRepository.save(existingSchoolFeatures);
	}
	
	// delete SchoolFeatures by id
	@DeleteMapping("/{id}")
	public ResponseEntity<SchoolFeatures> deleteSchoolFeatures(@PathVariable ("id") long SchoolFeaturesId){
		 SchoolFeatures existingSchoolFeatures = this.SchoolFeaturesRepository.findById(SchoolFeaturesId)
					.orElseThrow(() -> new ResourceNotFoundException("SchoolFeatures not found with id :" + SchoolFeaturesId));
		 this.SchoolFeaturesRepository.delete(existingSchoolFeatures);
		 return ResponseEntity.ok().build();
	}
}
