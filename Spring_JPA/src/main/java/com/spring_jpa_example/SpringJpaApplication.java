package com.spring_jpa_example;

import com.spring_jpa_example.Entity.User;
import com.spring_jpa_example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     /*   User user = new User();
        user.setId(2);
        user.setName("sudhir");
        user.setEmail("sudhir@gmail.com");
        user.setActive(true);
        User save = userRepository.save(user);
        System.out.println(" saved ...................." + save.getName());
*/
    }

}
