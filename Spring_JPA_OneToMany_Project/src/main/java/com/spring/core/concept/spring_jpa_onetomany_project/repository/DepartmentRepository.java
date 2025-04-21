package com.spring.core.concept.spring_jpa_onetomany_project.repository;

import com.spring.core.concept.spring_jpa_onetomany_project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

     /* Here you can create n no of method depend on your requirement */

    Optional<List<Department>> findByDepartmentName(String departmentName);

    Optional<Department> findByDepartmentCode (String departmentCode);



}
