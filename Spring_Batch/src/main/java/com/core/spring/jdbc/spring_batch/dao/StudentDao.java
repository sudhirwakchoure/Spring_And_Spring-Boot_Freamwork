package com.core.spring.jdbc.spring_batch.dao;


import com.core.spring.jdbc.spring_batch.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    private  JdbcTemplate jdbcTemplate;


    // save the 1 student
    public Student addStudent(Student student) {
        String sql = "INSERT INTO student (id, name, age, isActive) VALUES (?, ?, ?, ?)";
        int student1 = jdbcTemplate.update(sql,
                student.getId(),
                student.getName(),
                student.getAge(),
                student.isIsActive());
        System.out.println(student1 + "Student is added " + student.getName());
        return student;

    }

    //save the student using batch update
    public void saveStudent(List<Student> studentList) {
        String sql = "INSERT INTO student (id, name, age, isActive) VALUES (?, ?, ?, ?)";

        int[][] studentLists = jdbcTemplate.batchUpdate(sql, studentList, studentList.size(),
                (ps, student) -> {
                    ps.setInt(1, student.getId());
                    ps.setString(2, student.getName());
                    ps.setInt(3, student.getAge());
                    ps.setBoolean(4, student.setIsActive(student.isIsActive()));
                }
        );
        System.out.println(studentLists.length + "Student is added " + studentLists.length);

    }

}
