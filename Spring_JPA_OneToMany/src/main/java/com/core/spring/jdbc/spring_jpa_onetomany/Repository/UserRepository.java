package com.core.spring.jdbc.spring_jpa_onetomany.Repository;

import com.core.spring.jdbc.spring_jpa_onetomany.Entity.User;
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
