package com.spring_jdbc_demo_project.dao;



import com.spring_jdbc_demo_project.entity.Course;
import com.spring_jdbc_demo_project.util.CourseRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //save Course
    public void saveCourse(Course course) {
        String sql = "INSERT INTO courses ( courseId,title, description,price,category_Id) VALUES (?, ?, ? ,?,?)";
        int save = jdbcTemplate.update(sql, course.getCourseId(), course.getTitle(), course.getDescription(), course.getPrice(),course.getCategoryId());
        System.out.println("Course saved successfully" + save);

    }

    //update course
    public void updateCourse(int CourseId,Course course) {
        String sql = "UPDATE courses SET title = ?, description = ?, price = ? WHERE courseId = ?";
        int update = jdbcTemplate.update(sql, course.getTitle(), course.getDescription(), course.getPrice(), CourseId);
        System.out.println("Course updated successfully" + update);
    }

    //delete course
    public void deleteCourse(int courseId) {
        String sql = "DELETE FROM courses WHERE courseId = ?";
        int delete = jdbcTemplate.update(sql, courseId);
        System.out.println("Course deleted successfully" + delete);
    }

    //get course
    public Course getCourse(int courseId) {
        String sql = "SELECT * FROM courses WHERE courseId = ?";
        Course course = jdbcTemplate.queryForObject(sql, Course.class, courseId);
        System.out.println("Course retrieved successfully" + course);
        return course;
    }

    //get all courses
    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM courses";
        List<Course> courese = jdbcTemplate.query(sql, new CourseRowMapper());
        System.out.println("All courses retrieved successfully" + courese);
        return courese;
    }









}
