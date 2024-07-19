package com.example.myproject.controller;


import com.example.myproject.entities.Cars;
import com.example.myproject.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {
    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService){
        this.carsService = carsService;
    }

@GetMapping
    public List<Cars> getAllCars() {
    return carsService.getAllCars();
    }
}