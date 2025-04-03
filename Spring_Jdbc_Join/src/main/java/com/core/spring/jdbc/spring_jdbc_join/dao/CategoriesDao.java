package com.core.spring.jdbc.spring_jdbc_join.dao;


import com.core.spring.jdbc.spring_jdbc_join.entity.Categories;
import com.core.spring.jdbc.spring_jdbc_join.responces.CourseCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesDao {

   @Autowired
   private JdbcTemplate jdbcTemplate;


    //save categories
    public Categories save(Categories categories) {
        String query = "INSERT INTO categories (id ,title, description) VALUES (?, ?,?);";
        int res = jdbcTemplate.update(
                query,
                categories.getId(),
                categories.getTitle(),
                categories.getDescription());
        System.out.println(res+"category added............. ");
        return categories;
    }

    //update categories
    public Categories update(int categoryId,Categories categories) {
        String query = "UPDATE categories SET title = ?, description = ? WHERE id = ?;";
        int update = jdbcTemplate.update(query, categories.getTitle(), categories.getDescription(), categoryId);
        System.out.println(update+"   category updated............");
        return categories;
    }

    // delete categories
    public void delete(int categoryId) {
        String query = "DELETE FROM categories WHERE id = ?;";
        int update = jdbcTemplate.update(query, categoryId);
        System.out.println(update+"   category deleted...........");
    }


    //getById categories
    public Categories getByID(int categoryId) {
        String query = "SELECT * FROM categories WHERE id = ?;";
        Categories categories1 = jdbcTemplate.queryForObject(query,(rs, rowNum) ->
                new Categories(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description")),categoryId);
        System.out.println(categories1+"   category found...........");
        return categories1;

    }

     //getAllCategories
    public List<Categories> getAll() {
        String query = "SELECT * FROM categories;";
        List<Categories> categories = jdbcTemplate.query(query, (rs, rowNum) -> new Categories(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description")));
        System.out.println(categories+"   category list found...........");
        return categories;
    }

    //search by title
    public List<Categories> getByTitle(String title) {
        String query = "SELECT * FROM categories WHERE title LIKE ?;";
        List<Categories> categories = jdbcTemplate.query(query, (rs, rowNum) -> new Categories(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description")
        ),"%"+title+"%");
        System.out.println(categories+"   category list found. by like ..........");
        return categories;
    }

    //searchCoursesByCategoriesId
    public List<CourseCategoryResponse> searchCoursesByCategoriesId(int categoryId) {
        String query = "SELECT " +
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
                "    cat.id = ?";

        List<CourseCategoryResponse> categoryResponses = jdbcTemplate.query(query, (rs, rowNum) -> new CourseCategoryResponse(
                rs.getInt("courseId"),
                rs.getString("course_title"),
                rs.getString("course_description"),
                rs.getInt("course_price"),
                rs.getInt("category_id"),
                rs.getString("category_title"),
                rs.getString("category_description")
        ), categoryId);
        return categoryResponses;
    }


}
