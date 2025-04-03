package com.core.spring.jdbc.spring_jdbc.dao;

import com.core.spring.jdbc.spring_jdbc.entity.Category;
import com.core.spring.jdbc.spring_jdbc.util.CategoryRowMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @PostConstruct
    public void init(){
        String query = "CREATE TABLE IF NOT EXISTS categories (id INT PRIMARY KEY, title VARCHAR(100) NOT NULL, description VARCHAR(100));";
        jdbcTemplate.update(query);
        System.out.println("table created");
    }


    //save category
    public Category save(Category category){
        String query = "INSERT INTO categories (id ,title, description) VALUES (?, ?,?);";
        int res = jdbcTemplate.update(
                query,
                category.getId(),
                category.getTitle(),
                category.getDescription());
        System.out.println(res+"category added");
        return category;
    }

    //update category
    public Category update(int id,Category newcategory ){
        String query = "UPDATE categories SET title = ?, description = ? WHERE id = ?;";
        int res = jdbcTemplate.update(
                query,
                newcategory.getTitle(),
                newcategory.getDescription()
        );
        System.out.println(res+"category updated");
        newcategory.setId(id);
        return newcategory;
    }


    //get by id category
    public Category getByID(int categoryId){
      /* String query = "SELECT * FROM categories WHERE id = ?;";
        Category res = jdbcTemplate.queryForObject(query,Category.class,categoryId);
        System.out.println(res+"category found");
        return res;
*/
        String query = "SELECT * FROM categories WHERE id = ?;";
        return jdbcTemplate.queryForObject(query, new CategoryRowMapper(), categoryId);

    }

    //get all categories
    public List<Category> getAll(){
        String query = "SELECT * FROM categories;";
       // return jdbcTemplate.queryForList(query,Category.class);
        return jdbcTemplate.query(query, new CategoryRowMapper());
    }

    //DELETE FOR  categories
    public void delete(int id){
        String query = "DELETE FROM categories WHERE id = ?;";
        int res = jdbcTemplate.update(query, id);
        System.out.println(res+"category deleted");
    }
}
