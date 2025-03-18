package com.example.demo.Controller;

import com.example.demo.Dto.PatientDto;
import com.example.demo.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("getPatients")
    public List<PatientDto> getPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping("/addPatient")
    public PatientDto createPatient(@RequestBody PatientDto patientDto){
        return patientService.savePatient(patientDto);
    }

    @PutMapping
    public PatientDto updatePatient(@RequestBody PatientDto patientDto){
        return patientService.updatePatient(patientDto);
    }

    @DeleteMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable Integer id){
        return patientService.deletePatient(id);
    }
}
