package com.example.demo.Repo;

import com.example.demo.Entity.PharmacyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepo extends JpaRepository<PharmacyEntity, Integer> {

}
