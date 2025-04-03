package com.core.spring.jdbc.spring_jdbc_join.dao;

import com.core.spring.jdbc.spring_jdbc_join.entity.Course;
import com.core.spring.jdbc.spring_jdbc_join.responces.CourseCategoryResponse;
import com.core.spring.jdbc.spring_jdbc_join.util.CourseRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    //save
    public Course save(Course course) {
        String sql = "INSERT INTO course (courseId, title, description, price, categoriesId) VALUES (?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                course.getCourseId(),
                course.getTitle(),
                course.getDescription(),
                course.getPrice(),
                course.getCategoriesId());
        System.out.println(insert + " inserted successfully" );
        return  course;
    }


    //update courses
    public Course update(int CourseId,Course course) {
        String query = "Update course set title=?,category=?,price=?,categoriesId=? where CourseId=?";
        int update = jdbcTemplate.update(query, Course.class, CourseId);
        System.out.println(update + " updated Successfully");
        return course;
    }


    //getAll
    public List<Course> getAll() {
        String sql = "select * from course";
        List<Course> courses = jdbcTemplate.query(sql, new CourseRowMapper());
        System.out.println(courses+" get all Successfully");
        return courses;

    }

    //delete
    public void delete(int CourseId) {
        String query = "Delete from course where CourseId=?";
        int delete = jdbcTemplate.update(query, CourseId);
        System.out.println(delete + " deleted Successfully");
    }



    //get courses
    public Course getCourseById(int courseId) {
        String sql = "select * from course where courseId=?";
        Course course = jdbcTemplate.queryForObject(sql, new CourseRowMapper(), courseId);
        System.out.println(course + " get Course By Id course successfully");
        return course;
    }

    //getByTitleOrDescription
    public List<Course> getCourseByTitleOrDescription(String title, String description) {
        String sql = "select * from course where title like ? and description like ?";
        List<Course> courses = jdbcTemplate.query(sql, new CourseRowMapper(), title, description);
        System.out.println(courses+" get course By Title Or Description course successfully");
        return courses;
    }

   /* //GetCategoryByCourseID
    public CourseCategoryResponse GetCategoryByCourseID(int courseId) {
        String sql = "SELECT \n" +
                "    c.courseId,\n" +
                "    c.title AS course_title,\n" +
                "    c.description AS course_description,\n" +
                "    c.price,\n" +
                "    cat.id AS category_id,\n" +
                "    cat.title AS category_title,\n" +
                "    cat.description AS category_description\n" +
                "FROM \n" +
                "    course c\n" +
                "JOIN \n" +
                "    categories cat\n" +
                "ON \n" +
                "    c.categoriesId = cat.id\n" +
                "WHERE \n" +
                "    c.courseId = <desired_course_id>;";

        jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new CourseCategoryResponse(
                rs.getInt("courseId"),
                rs.getString("course_title"),
                rs.getString("course_description"),
                rs.getInt("course_price"),
                rs.getInt("category_id"),
                rs.getString("category_title"),
                rs.getString("category_description")),courseId);


    }*/

    public List<CourseCategoryResponse> GetCategoryByCourseID(int courseId) {
        String sql = "SELECT " +
                "    c.courseId, " +
                "    c.title AS course_title, " +
                "    c.description AS course_description, " +
                "    c.price AS course_price, " +
                "    cat.id AS category_id, " +
                "    cat.title AS category_title, " +
                "    cat.description AS category_description " +
                "FROM " +
                "    course c " +
                "JOIN " +
                "    categories cat " +
                "ON " +
                "    c.categoriesId = cat.id " +
                "WHERE " +
                "    c.courseId = ?;";

        List<CourseCategoryResponse> courseCategoryResponse = jdbcTemplate.query(sql, (rs, rowNum) -> new CourseCategoryResponse(
                rs.getInt("courseId"),
                rs.getString("course_title"),
                rs.getString("course_description"),
                rs.getInt("course_price"),
                rs.getInt("category_id"),
                rs.getString("category_title"),
                rs.getString("category_description")
        ), courseId);
        System.out.println(courseCategoryResponse+" get Course By Id course successfully");
        return courseCategoryResponse;
    }

}
