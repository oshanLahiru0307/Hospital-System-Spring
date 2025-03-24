package com.example.demo.Controller;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Service.DoctoerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctoerServices doctoerServices;

    @GetMapping("/getAllDoctors")
    public List<DoctorDto> getDoctors(){
        return doctoerServices.getAllDoctor();
    }

    @GetMapping("/getDoctor/{doctorId}")
    public DoctorDto getDoctor(@PathVariable int doctorId){
        return doctoerServices.getDoctorById(doctorId);
    }

    @PostMapping("/addDoctor")
    public DoctorDto addDoctor(@RequestBody DoctorDto doctorDto){
        return doctoerServices.saveDoctor(doctorDto);
    }

    @PutMapping("/updateDoctor")
    public DoctorDto updateDoctor(@RequestBody DoctorDto doctorDto){
        return doctoerServices.updateDoctor(doctorDto);
    }

    @DeleteMapping("/deleteDoctor/{doctorId}")
    public DoctorDto deleteDoctor(@PathVariable int doctorId){
        return doctoerServices.deleteDoctor(doctorId);
    }


}
