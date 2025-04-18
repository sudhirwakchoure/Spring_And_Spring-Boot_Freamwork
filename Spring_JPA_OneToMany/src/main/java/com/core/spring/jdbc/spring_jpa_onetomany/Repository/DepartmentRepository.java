package com.core.spring.jdbc.spring_jpa_onetomany.Repository;

import com.core.spring.jdbc.spring_jpa_onetomany.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    /*  Here we can create n no of method */

    Optional<Department> findByDepartmentName(String departmentName);

    Optional<List<Department>> findByDepartmentCode(String departmentCode);


}
