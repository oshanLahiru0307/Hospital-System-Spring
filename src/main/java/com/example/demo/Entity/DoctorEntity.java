package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String speciality;
    private String Contact;
    private String Email;


    public DoctorEntity(String name, String gender, String speciality, String contact, String email) {
        this.name = name;
        this.gender = gender;
        this.speciality = speciality;
        Contact = contact;
        Email = email;
    }

}
