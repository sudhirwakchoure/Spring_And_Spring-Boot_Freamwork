package com.core.spring.jdbc.spring_jdbc_join.util;

import com.core.spring.jdbc.spring_jdbc_join.entity.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course course = new Course();
        course.setCourseId(rs.getInt("courseId"));
        course.setTitle(rs.getString("title"));
        course.setDescription(rs.getString("description"));
        course.setPrice(rs.getInt("price"));
        course.setCategoriesId(rs.getInt("categoriesId"));
        return course;
    }
}
