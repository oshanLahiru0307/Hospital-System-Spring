package com.example.demo.Service;

import com.example.demo.Dto.AppointmentDto;
import com.example.demo.Entity.AppoinmentEntity;
import com.example.demo.Repo.AppointmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<AppointmentDto> getAllAppointments(){
        List<AppoinmentEntity> appointments = appointmentRepo.findAll();
        return modelMapper.map(appointments, new TypeToken<List<AppointmentDto>>(){}.getType());
    }

    public AppointmentDto getAppointmentById(int id){
        Optional<AppoinmentEntity> appointment = appointmentRepo.findById(id);
        return modelMapper.map(appointment, AppointmentDto.class);
    }

    public AppointmentDto addAppointment(AppointmentDto appointmentDto){
        appointmentRepo.save(modelMapper.map(appointmentDto, AppoinmentEntity.class));
        return appointmentDto;
    }

    public AppointmentDto updateAppointment(AppointmentDto appointmentDto){
        appointmentRepo.save(modelMapper.map(appointmentDto, AppoinmentEntity.class));
        return appointmentDto;
    }

    public AppointmentDto deleteAppointment(int id){
        Optional<AppoinmentEntity> appointment = appointmentRepo.findById(id);
        appointmentRepo.deleteById(id);
        return modelMapper.map(appointment, AppointmentDto.class);
    }

}
