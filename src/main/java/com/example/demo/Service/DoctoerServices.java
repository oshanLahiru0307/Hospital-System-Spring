package com.example.demo.Service;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Entity.DoctorEntity;
import com.example.demo.Repo.DoctorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DoctoerServices {

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private ModelMapper modelMapper;

    public DoctorDto saveDoctor(DoctorDto doctorDto) {
         doctorRepo.save(modelMapper.map(doctorDto, DoctorEntity.class));
         return doctorDto;
    }







}
