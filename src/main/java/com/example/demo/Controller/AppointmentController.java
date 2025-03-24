package com.example.demo.Controller;

import com.example.demo.Dto.AppointmentDto;
import com.example.demo.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/getAllAppointments")
    public List<AppointmentDto> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }
}
