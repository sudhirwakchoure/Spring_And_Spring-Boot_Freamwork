package com.core.spring.jdbc.spring_jdbc.util;

import com.core.spring.jdbc.spring_jdbc.entity.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {

    //logic to convert a table row category object;
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        //create a category object
        Category category = new Category()
                ;
        category.setId(rs.getInt("id"));
        category.setTitle(rs.getString("title"));
        category.setDescription(rs.getString("description"));
        return category;
    }
}
