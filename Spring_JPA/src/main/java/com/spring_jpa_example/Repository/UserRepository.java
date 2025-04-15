package com.spring_jpa_example.Repository;

import com.spring_jpa_example.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Integer> {

     /*  Here we can create n no of method */
      Optional<User> findByEmail(String email);

      Optional<List<User>> findByName(String name);

    Optional<User> findByNameAndEmail(String name, String email);

    Optional<List<User>> findByNameContaining(String name);
}
