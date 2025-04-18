package com.core.spring.jdbc.spring_jpa_onetomany.Repository;

import com.core.spring.jdbc.spring_jpa_onetomany.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

    /*  Here we can create n no of method */
    Optional<Laptop> findByModel(String model);
}
