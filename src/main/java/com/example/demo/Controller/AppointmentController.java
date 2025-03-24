package com.example.demo.Controller;

import com.example.demo.Dto.AppointmentDto;
import com.example.demo.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/getAllAppointments")
    public List<AppointmentDto> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/getAppoinment/{id}")
    public AppointmentDto getAppointment(@PathVariable int id){
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping("/addAppointment")
    public AppointmentDto addAppointment(@RequestBody AppointmentDto appointmentDto){
        return appointmentService.addAppointment(appointmentDto);
    }

    @PutMapping("/updateAppointment")
    public AppointmentDto updateAppointment(@RequestBody AppointmentDto appointmentDto){
        return appointmentService.updateAppointment(appointmentDto);
    }

    @DeleteMapping("/deleteAppointment/{id}")
    public AppointmentDto deleteAppointment(@PathVariable int id){
        return appointmentService.deleteAppointment(id);
    }

}
