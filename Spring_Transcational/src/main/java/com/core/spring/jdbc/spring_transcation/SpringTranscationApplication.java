package com.core.spring.jdbc.spring_transcation;

import com.core.spring.jdbc.spring_transcation.dao.StudentDao;
import com.core.spring.jdbc.spring_transcation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringTranscationApplication  implements CommandLineRunner {


    @Autowired
    private StudentDao studentDao;


    public static void main(String[] args) {
        SpringApplication.run(SpringTranscationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



            // Create and save a single student
            Student student = new Student();
//        student.setId(1);
//        student.setName("John");
//        student.setAge(20);
//        student.setIsActive(true);
//        Student savedStudent = studentDao.addStudent(student); // Save the student
//        System.out.println(savedStudent + " Student is added: " + student.getName());

// Save a list of students
            List<Student> studentList = new ArrayList<>();

            for (int i = 2; i <= 100; i++) {
                Student student1 = new Student(); // Create a new Student instance for each iteration
                student1.setId(i); // Unique ID
                student1.setName("Student" + i); // Name: "Student1", "Student2", ...
                student1.setAge(18 + (i % 5)); // Age range between 18 and 22
                student1.setIsActive(i % 2 == 0); // Alternate true (even IDs) and false (odd IDs)
                studentList.add(student1); // Add to the list
            }

// Save the batch of students
            studentDao.saveStudentBatchWithRollback(studentList);
            System.out.println(studentList.size() + " students inserted successfully.");

// Print details of each student
            for (Student student1 : studentList) {
                System.out.println("Name: " + student1.getName() + ", Age: " + student1.getAge());
            }

        }

}
