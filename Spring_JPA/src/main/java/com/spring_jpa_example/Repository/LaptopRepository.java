package com.spring_jpa_example.Repository;

import com.spring_jpa_example.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

    /*  Here we can create n no of method */
    Optional<Laptop> findByModel(String model);
}
