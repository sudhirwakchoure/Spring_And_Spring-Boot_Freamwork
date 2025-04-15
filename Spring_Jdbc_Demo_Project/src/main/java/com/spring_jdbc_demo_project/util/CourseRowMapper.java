package com.spring_jdbc_demo_project.util;

import com.spring_jdbc_demo_project.entity.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Course course = new Course();
        course.setCourseId(rs.getInt("courseId"));
        course.setTitle(rs.getString("title"));
        course.setDescription(rs.getString("description"));
        course.setPrice(rs.getInt("price"));
        
        return null;
    }
}
