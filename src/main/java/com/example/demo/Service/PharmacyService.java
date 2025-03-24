package com.example.demo.Service;

import com.example.demo.Dto.PharmacyDto;
import com.example.demo.Entity.PharmacyEntity;
import com.example.demo.Repo.PharmacyRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PharmacyService {

    @Autowired
    private PharmacyRepo pharmacyRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PharmacyDto addItem(PharmacyDto pharmacyDto){
        pharmacyRepo.save(modelMapper.map(pharmacyDto, PharmacyEntity.class));
        return pharmacyDto;
    }

    public List<PharmacyDto> getAllItems(){
        List<PharmacyEntity> itemList = pharmacyRepo.findAll();
        return modelMapper.map(itemList, new TypeToken<List<PharmacyDto>>(){}.getType());
    }

    public PharmacyDto getItemById(int id){
        Optional<PharmacyEntity> item = pharmacyRepo.findById(id);
        return modelMapper.map(item, PharmacyDto.class);
    }

    public PharmacyDto updateItem(PharmacyDto pharmacyDto){
        pharmacyRepo.save(modelMapper.map(pharmacyDto, PharmacyEntity.class));
        return pharmacyDto;
    }

    public PharmacyDto deleteItemById(int id){
        Optional<PharmacyEntity> item = pharmacyRepo.findById(id);
        pharmacyRepo.deleteById(id);
        return modelMapper.map(item, PharmacyDto.class);
    }
}
