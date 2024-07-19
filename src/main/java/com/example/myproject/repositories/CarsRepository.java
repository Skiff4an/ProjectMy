package com.example.myproject.repositories;

import com.example.myproject.entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarsRepository extends JpaRepository<Cars, Long> {

   // String getByid(Long id);
   // String getByname(String name);
   // String getByhp(Long hp);
}
