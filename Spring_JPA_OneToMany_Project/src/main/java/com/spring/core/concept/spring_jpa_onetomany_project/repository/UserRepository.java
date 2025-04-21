package com.spring.core.concept.spring_jpa_onetomany_project.repository;

import com.spring.core.concept.spring_jpa_onetomany_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

     Optional<User> findByUserIdAndUserName(int userId, String userName);

     Optional<List<User>> findByUserNameAndUserEmail(String userName, String userEmail);



}


