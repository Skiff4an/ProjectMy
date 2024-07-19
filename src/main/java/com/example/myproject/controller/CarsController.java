package com.example.myproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")

public class CarsController {

@GetMapping("/cars")
    public String getAllCars() {


        return "TEST";
    }
}