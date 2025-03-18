package com.example.demo.Repo;

import com.example.demo.Entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<PatientEntity, Integer>{
}
