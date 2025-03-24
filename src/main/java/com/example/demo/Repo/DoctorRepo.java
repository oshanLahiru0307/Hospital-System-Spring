package com.example.demo.Repo;

import com.example.demo.Entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorEntity, Entity> {
}
