package com.example.demo.Controller;

import com.example.demo.Dto.DoctorDto;
import com.example.demo.Service.DoctoerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctoerServices services;

    @PostMapping("/addDoctor")
    public DoctorDto addDoctor(@RequestBody DoctorDto doctorDto){
        return services.saveDoctor(doctorDto);
    }

}
