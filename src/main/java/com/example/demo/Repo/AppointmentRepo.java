package com.example.demo.Repo;

import com.example.demo.Entity.AppoinmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<AppoinmentEntity, Integer> {
}
