package com.example.demo.Service;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Entity.DoctorEntity;
import com.example.demo.Repo.DoctorRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DoctoerServices {

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private ModelMapper modelMapper;

    //create new doctor...
    public DoctorDto saveDoctor(DoctorDto doctorDto) {
         doctorRepo.save(modelMapper.map(doctorDto, DoctorEntity.class));
         return doctorDto;
    }

    //get all the available doctors...
    public List<DoctorDto> getAllDoctor(){
        List<DoctorEntity> doctorList = doctorRepo.findAll();
        return modelMapper.map(doctorList, new TypeToken<List<DoctorDto>>(){}.getType());
    }

    //get single doctor details...
    public DoctorDto getDoctorById(Integer id) {
        Optional<DoctorEntity> doctorEntity = doctorRepo.findById(id);
        return modelMapper.map(doctorEntity, DoctorDto.class);
    }

    //update doctor...
    public DoctorDto updateDoctor(DoctorDto doctorDto) {
        doctorRepo.save(modelMapper.map(doctorDto, DoctorEntity.class));
        return doctorDto;
    }

    //delete doctor using doctor id...
    public DoctorDto deleteDoctor(Integer id) {
        Optional<DoctorEntity> doctorEntity = doctorRepo.findById(id);
        doctorRepo.deleteById(id);
        return modelMapper.map(doctorEntity, DoctorDto.class);
    }


}
