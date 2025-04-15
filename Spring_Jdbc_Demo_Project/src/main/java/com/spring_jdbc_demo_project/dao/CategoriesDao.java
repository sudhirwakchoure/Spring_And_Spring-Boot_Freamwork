package com.spring_jdbc_demo_project.dao;


import com.spring_jdbc_demo_project.entity.Categories;
import com.spring_jdbc_demo_project.responce.CourseAndCategoryResponce;
import com.spring_jdbc_demo_project.util.CategoriesRowMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesDao {

        @Autowired
        private JdbcTemplate jdbcTemplate;


    @PostConstruct
    public void init(){
        System.out.println("init method called");
        String query = "CREATE TABLE IF NOT EXISTS categories (id INT PRIMARY KEY, title VARCHAR(50) NOT NULL, description VARCHAR(100))";
        jdbcTemplate.execute(query);
        System.out.println("table created..."+query);

    }


    //save categories
    public Categories save(Categories categories){
        String sql = "INSERT INTO categories(id, title, description) VALUES(?, ?, ?)";
        int update = jdbcTemplate.update(sql, categories.getId(), categories.getTitle(), categories.getDescription());
        System.out.println("number of record inserted..."+update);
        return categories;
    }

    //update categories
    public  Categories update (int categoriesId,Categories newCategories){
        String query="update categories set title=?, description=? where id=?";
        int update = jdbcTemplate.update(query, newCategories.getTitle(), newCategories.getDescription(), categoriesId);
        System.out.println("number of record updated..."+update);
        newCategories.setId(categoriesId);
        return newCategories;
    }

    //get categoriesById
    public Categories getCategoriesById(int categoriesId){
        String query="select * from categories where id=?";
        Categories categories = jdbcTemplate.queryForObject(query, Categories.class, categoriesId);
        System.out.println("categories fetched..."+categories);
        return categories;
    }

    //delete categories
    public int deleteCategories(int categoriesId){
        String query="delete from categories where id=?";
        int update = jdbcTemplate.update(query, categoriesId);
        System.out.println("number of record deleted..."+update);
        return update;
    }

    //get all categories
    public List<Categories> getAllCategories(){
        String query="select * from categories";
        List<Categories> categories = jdbcTemplate.query(query, new CategoriesRowMapper());
        System.out.println("categories fetched..."+categories);
        return  categories;
    }


    //get by title
    public List<Categories> getByTitle(String title) {
        String query = "SELECT * FROM categories WHERE title LIKE ?";
      // Categories res = jdbcTemplate.queryForObject(query, Categories.class, "%" + title + "%");
        List<Categories> categories = jdbcTemplate.query(query, new CategoriesRowMapper(),"%" + title + "%");
        System.out.println("categories fetched..."+categories);
        return  categories;

    }

    // getByTitleOrDescription

    public List<Categories> getByTitleOrDescription(String title, String description){

        String query = "SELECT * FROM categories WHERE title LIKE ?  OR description Like ?";
        List<Categories> categories = jdbcTemplate.query(query, new CategoriesRowMapper(),"%" + title + "%","%" + description + "%");
        System.out.println("categories fetched..."+categories);
        return  categories;
    }

     //getCoursesAndCategoriesByCategoriesId
     public List<CourseAndCategoryResponce> getCoursesByCategoriesId(int categoriesId) {
        String query = "SELECT c.courseId AS course_id, c.title AS course_title, c.description AS course_description, " +
         "ca.id AS category_id, ca.title AS category_title, ca.description AS category_description " +
                 "FROM courses c JOIN categories ca ON c.category_Id = ca.id WHERE ca.id = ?";;

         List<CourseAndCategoryResponce> courseAndCategoryResponceList = jdbcTemplate.query(query, (rs, rowNum) -> {
             CourseAndCategoryResponce responce = new CourseAndCategoryResponce();
             responce.setCourse_Id(rs.getInt("course_id"));
             responce.setCourse_title(rs.getString("course_title"));
             responce.setCourse_description(rs.getString("course_description"));
             responce.setCategory_Id(rs.getInt("category_id"));
             responce.setCategories_title(rs.getString("category_title"));
             responce.setCategories_description(rs.getString("category_description"));
             return responce;
         }, categoriesId);
         System.out.println("categories fetched..."+courseAndCategoryResponceList);
         return  courseAndCategoryResponceList;

     }





}
