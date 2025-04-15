package com.spring_jpa_example.Repository;

import com.spring_jpa_example.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    /*  Here we can create n no of method */

    Optional<Department> findByDepartmentName(String departmentName);

    Optional<List<Department>> findByDepartmentCode(String departmentCode);


}
