package com.example.myproject.service;

import com.example.myproject.entities.Cars;
import com.example.myproject.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {
    @Autowired
    private CarsRepository repository;
    public List<Cars> getAllCars() {
        return repository.findAll();
    }

}
