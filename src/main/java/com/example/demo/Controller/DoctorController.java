package com.example.demo.Controller;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Service.DoctoerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class DoctorController {

    @Autowired
    private DoctoerServices services;

    @PostMapping("/saveDoctor")
    public DoctorDto addDoctor(@RequestBody DoctorDto doctorDto){
        return services.saveDoctor(doctorDto);
    }


}
