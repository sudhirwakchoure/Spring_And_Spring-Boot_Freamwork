package com.spring_jdbc_demo_project.util;


import com.spring_jdbc_demo_project.entity.Categories;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriesRowMapper  implements RowMapper {


    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categories categories = new Categories();

        categories.setId(rs.getInt("id"));
        categories.setTitle(rs.getString("title"));
        categories.setDescription(rs.getString("description"));
        return categories;
    }


}
