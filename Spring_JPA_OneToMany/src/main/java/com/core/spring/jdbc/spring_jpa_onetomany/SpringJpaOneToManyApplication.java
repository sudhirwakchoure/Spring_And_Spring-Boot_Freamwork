package com.core.spring.jdbc.spring_jpa_onetomany;

import com.core.spring.jdbc.spring_jpa_onetomany.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaOneToManyApplication implements CommandLineRunner {


    private UserRepository userRepository;



    public static void main(String[] args) {
        SpringApplication.run(SpringJpaOneToManyApplication.class, args);
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
