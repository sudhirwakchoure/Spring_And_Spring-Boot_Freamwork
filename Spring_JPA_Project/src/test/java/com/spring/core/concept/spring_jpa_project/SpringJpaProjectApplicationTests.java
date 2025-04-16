package com.spring.core.concept.spring_jpa_project;

import com.spring.core.concept.spring_jpa_project.entity.Department;
import com.spring.core.concept.spring_jpa_project.entity.User;
import com.spring.core.concept.spring_jpa_project.repository.DepartmentRepository;
import com.spring.core.concept.spring_jpa_project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringJpaProjectApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void contextLoads() {
    }


    @Test
    public void saveUser(){

        User user = new User();
        user.setUserName("sudhir");
        user.setUserEmail("sudhir@gmail.com");
        user.setAge(27);
        user.setActive(true);
        User save = userRepository.save(user);
        System.out.println(save.getUserName()   + " user saved");
    }

    @Test
    public void findById() {
        Optional<User> user = userRepository.findByUserIdAndUserName(1, "sudhir");
        User result = user.orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println(result.getUserName());
    }

    @Test
    public void findByUserNameAndUserEmail() {
        Optional<List<User>> user = userRepository.findByUserNameAndUserEmail("sudhir", "sudhir@gmail.com");
        List<User> result = user.orElseThrow(() -> new RuntimeException("User not found"));
        result.forEach(user1 -> System.out.println(user1.getUserName()));
    }


    @Test
    public void saveDepartment(){

        Department  department = new Department();
        department.setDepartmentName("Information Technology");
        department.setDepartmentCode("IT");
        department.setAbout("Information Technology department " );
        Department save = departmentRepository.save(department);
        System.out.println(save.getDepartment_Id()   + " " + save.getDepartmentName() + "department saved");
    }


    @Test

    public void findByDepartmentId() {
        Optional<Department> department = departmentRepository.findById(1);
        Department result = department.orElseThrow(() -> new RuntimeException("Department not found"));
        System.out.println(result.getDepartmentName());
    }

    @Test
    public void findByDepartmentName() {
        Optional<List<Department>> department = departmentRepository.findByDepartmentName("Information Technology");
        department.orElseThrow(() -> new RuntimeException("Department not found"));
        List<Department> result = department.get();
        result.forEach(department1 -> System.out.println(department1.getDepartmentName()+" "+department1.getDepartmentCode()+" "+department1.getAbout()));
    }


    @Test
    public void findByDepartmentCode() {
        Optional<Department> department = departmentRepository.findByDepartmentCode("IT");
        department.orElseThrow(() -> new RuntimeException("Department not found"));
        Department result = department.get();
        System.out.println(result.getDepartmentName()+" "+result.getDepartmentCode()+" "+result.getAbout());
    }







}
