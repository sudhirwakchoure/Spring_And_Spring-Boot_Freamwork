package com.core.spring.jdbc.spring_jpa_onetomany;

import com.core.spring.jdbc.spring_jpa_onetomany.Entity.Department;
import com.core.spring.jdbc.spring_jpa_onetomany.Entity.Laptop;
import com.core.spring.jdbc.spring_jpa_onetomany.Entity.User;
import com.core.spring.jdbc.spring_jpa_onetomany.Repository.DepartmentRepository;
import com.core.spring.jdbc.spring_jpa_onetomany.Repository.LaptopRepository;
import com.core.spring.jdbc.spring_jpa_onetomany.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class
SpringJpaOneToManyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LaptopRepository laptopRepository;


    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void saveUser() {

        User u = new User();
        u.setId(1);
        u.setName("sudhir");
        u.setEmail("sudhir@gmail.com");
        u.setActive(true);
        User save = userRepository.save(u);
        System.out.println(save.getName() + " saved successfully ");


    }

    @Test
    void getByEmail() {
        Optional<User> byEmail = userRepository.findByEmail("sudhir@gmail.com");
        User emailResult = byEmail.orElseThrow(() -> new RuntimeException("Email not found"));
        System.out.println(emailResult.getName() + " \t" + emailResult.getEmail() + " find successfully ");

    }

    @Test
    void getByName() {
        Optional<List<User>> byName = userRepository.findByName("hairbrush");

        // Check if the Optional is present and if the list inside it is empty
        List<User> users = byName.filter(list -> !list.isEmpty())
                .orElseThrow(() -> new RuntimeException("No user found for name hairbrush"));

        users.forEach(user -> System.out.println(user.getName() +
                " \t" + user.getEmail() + " found successfully "));

    }


    @Test
    void saveDepartment() {

        Department department = new Department();
        department.setDepartmentName("computer science");
        department.setDepartmentCode("CS");
        department.setAbout("This is a computer science department ");
        Department saveDepartment = departmentRepository.save(department);
        System.out.println(saveDepartment.getDepartmentName() + " saved successfully ");
    }

    @Test
    public void saveUserByLaptop() {

            // Fetch existing user or throw an exception if not found
            Optional<User> byId = userRepository.findById(1);
            User user = byId.orElseThrow(() -> new RuntimeException("User not found"));

            // Create and associate laptops with the user
            Laptop laptop = new Laptop();
            laptop.setModel("Dell Inspiration 23");
            laptop.setAbout("This is a Dell Inspiration 23 Laptop");
            laptop.setUser(user);

            Laptop laptop1 = new Laptop();
            laptop1.setModel("MacBook Air");
            laptop1.setAbout("This is a MacBook Air");
            laptop1.setUser(user);

            // Add laptops to user
            List<Laptop> laptops = new ArrayList<>();
            laptops.add(laptop);
            laptops.add(laptop1);
            user.setLaptopList(laptops);

            // Save the user, which will also save the laptops due to cascade
            userRepository.save(user);

            System.out.println(user.getName() + " saved successfully with laptops!");

    }

    @Test
    void getByIdUserWithLaptop() {

        Optional<User> byId = userRepository.findById(1);
        User user = byId.orElseThrow(() -> new RuntimeException("User not found"));
        List<Laptop> laptopList = user.getLaptopList();
        laptopList.forEach(laptop -> System.out.println(laptop.getModel()
                + " \t" + laptop.getAbout()
                + " \t" + laptop.getModel()

                + user.getName() + " found successfully "));
    }
}
