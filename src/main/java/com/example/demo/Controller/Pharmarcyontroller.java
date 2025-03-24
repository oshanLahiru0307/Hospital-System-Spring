package com.example.demo.Controller;

import com.example.demo.Dto.PharmacyDto;
import com.example.demo.Service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class Pharmarcyontroller {

    @Autowired
    private PharmacyService pharmacyService;

    @GetMapping("/getAllItems")
    public List<PharmacyDto> getAllItems(){
        return pharmacyService.getAllItems();
    }

    @GetMapping("/getItem/{id}")
    public PharmacyDto getItem(@PathVariable int id){
        return pharmacyService.getItemById(id);
    }

    @PostMapping("/addItem")
    public PharmacyDto addItem(@RequestBody PharmacyDto pharmacyDto){
        return pharmacyService.addItem(pharmacyDto);
    }

    @PutMapping("/updateItem")
    public PharmacyDto updateItem(@RequestBody PharmacyDto pharmacyDto){
        return pharmacyService.updateItem(pharmacyDto);
    }

    @DeleteMapping("/deleteItem/{id}")
    public PharmacyDto deleteItem(@PathVariable int id){
        return pharmacyService.deleteItemById(id);
    }
}

