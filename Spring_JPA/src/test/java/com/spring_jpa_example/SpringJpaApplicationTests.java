package com.spring_jpa_example;

import com.spring_jpa_example.Entity.Department;
import com.spring_jpa_example.Entity.Laptop;
import com.spring_jpa_example.Entity.User;
import com.spring_jpa_example.Repository.DepartmentRepository;
import com.spring_jpa_example.Repository.LaptopRepository;
import com.spring_jpa_example.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringJpaApplicationTests {

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
        u.setId(2);
        u.setName("sudhir");
        u.setEmail("sudhir@gmail.com");
        u.setActive(true);
        User save = userRepository.save(u);
        System.out.println(save.getName()+" saved successfully ");


    }
    @Test
    void getByEmail() {
         Optional<User> byEmail = userRepository.findByEmail("sudhir@gmail.com");
        User emailResult = byEmail.orElseThrow(() -> new RuntimeException("Email not found"));
        System.out.println(emailResult.getName()+ " \t"+ emailResult.getEmail() + " find successfully ");

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
    public void saveUserByLaptop(){

        Optional<User> byId = userRepository.findById(1);
        User user = byId.orElseThrow(() -> new RuntimeException("User not found"));

        Laptop laptop = new Laptop();
        laptop.setModel("Dell inspiration 23");
        laptop.setAbout("This is a Dell inspiration 23 Laptop");
        laptop.setUser(user);
        user.setLaptop(laptop);
        laptopRepository.save(laptop);
        System.out.println(user.getName()+" saved successfully ");

    }

    @Test
    void getByIdUserWithLaptop() {

        Optional<User> byId = userRepository.findById(1);
        User user = byId.orElseThrow(() -> new RuntimeException("User not found"));
        Laptop laptop = user.getLaptop();
        System.out.println(laptop.getModel()+
                " \t" + laptop.getAbout() +
                " \t" +laptop.getUser().getName()+
                " \t" +laptop.getUser().getEmail()+
                "\t" +laptop.getUser().getId()+
                " found successfully ");
    }
}
