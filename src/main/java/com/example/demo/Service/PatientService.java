package com.example.demo.Service;

import com.example.demo.Dto.PatientDto;
import com.example.demo.Entity.PatientEntity;
import com.example.demo.Repo.PatientRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<PatientDto> getAllPatients(){
        List<PatientEntity> patientList = patientRepo.findAll();
        return modelMapper.map(patientList, new TypeToken<List<PatientDto>>(){}.getType());
    }

    public PatientDto savePatient(PatientDto patientDto){
        patientRepo.save(modelMapper.map(patientDto, PatientEntity.class));
        return patientDto;
    }

    public PatientDto updatePatient(PatientDto patientDto){
        patientRepo.save(modelMapper.map(patientDto, PatientEntity.class));
        return patientDto;
    }

    public String deletePatient(Integer patientId){
         patientRepo.deleteById(patientId);
         return "Patient deleted";
    }


}
