package com.example.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.school.entity.SchoolFeatures;



@Repository
public interface SchoolFeaturesRepository extends JpaRepository<SchoolFeatures, Long>{

}
