package com.spring.core.concept.spring_jpa_onetomany_project.repository;

import com.spring.core.concept.spring_jpa_onetomany_project.entity.Address;
import com.spring.core.concept.spring_jpa_onetomany_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    /* Here you can create n no of method depend on your requirement */

    Optional<List<Address>> findByUser(Optional<User> user);




}
