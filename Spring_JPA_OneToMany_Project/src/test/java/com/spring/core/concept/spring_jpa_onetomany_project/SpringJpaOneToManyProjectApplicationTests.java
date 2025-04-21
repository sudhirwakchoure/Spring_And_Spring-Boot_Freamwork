package com.spring.core.concept.spring_jpa_onetomany_project;

import com.spring.core.concept.spring_jpa_onetomany_project.entity.Address;
import com.spring.core.concept.spring_jpa_onetomany_project.entity.Department;
import com.spring.core.concept.spring_jpa_onetomany_project.entity.User;
import com.spring.core.concept.spring_jpa_onetomany_project.repository.AddressRepository;
import com.spring.core.concept.spring_jpa_onetomany_project.repository.DepartmentRepository;
import com.spring.core.concept.spring_jpa_onetomany_project.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringJpaOneToManyProjectApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private AddressRepository addressRepository;


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

        Department department = new Department();
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


    @Test
    public void saveAddress(){

        Address  address = new Address();
        address.setStreet("51 A,1st Floor");
        address.setCity("Shirdi");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setZipCode("500035");
        Address save = addressRepository.save(address);
        System.out.println(save.getAddressId() + " \t"+ save.getCity()  +" address saved");

    }




    @Test
    public void saveUserWithAddress(){

        User founduser = userRepository.findById(1).orElseThrow(() -> new RuntimeException("user not found"));

        // Creating addresses and setting fields
        Address address1 = new Address();
        address1.setStreet("51 A,1st Floor");
        address1.setCity("Shirdi");
        address1.setState("Maharashtra");
        address1.setCountry("India");
        address1.setZipCode("500035");
        address1.setUser(founduser);


        Address address2 = new Address();
        address2.setStreet("52 A,1st Floor");
        address2.setCity("Pune");
        address2.setState("Maharashtra");
        address2.setCountry("India");
        address2.setZipCode("401107");
        address2.setUser(founduser);

        // Adding addresses to the user's address list
        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);


        founduser.setAddressList(addressList);
        User save = userRepository.save(founduser);

        System.out.println("user are save with address" + save.getUserName() + "\t"+ save.getAddressList().get(1).getAddressId());


    }


    @Test
    public void getAddressByUserId() {

        Optional<User> userOptional = userRepository.findById(1);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println(user.getUserName());

        List<Address> addressList = user.getAddressList();

        addressList.forEach(address ->
                System.out.println(address.getCountry() +"\t"+
                        address.getZipCode() + "\t"+
                        address.getStreet()));

    }


    @Test
    public void findByUser(){

        Optional<User> byId = userRepository.findById(1);

        List<Address> AddressList = addressRepository.findByUser(byId).orElseThrow(() -> new RuntimeException("No address found"));
        AddressList.forEach(address -> System.out.println(
                  address.getAddressId() + "\t"
                + address.getCity() + "\t"
                + address.getZipCode() + "\t"
                + address.getStreet()));



    }






}
