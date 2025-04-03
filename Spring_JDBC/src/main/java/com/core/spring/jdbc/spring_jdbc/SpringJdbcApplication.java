package com.core.spring.jdbc.spring_jdbc;

import com.core.spring.jdbc.spring_jdbc.dao.CategoryDao;
import com.core.spring.jdbc.spring_jdbc.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication  implements CommandLineRunner {

    @Autowired
    private CategoryDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started");

        Category category= new Category();

//        category.setId(1);
//        category.setTitle("Trending ");
//        category.setDescription("Trending  category" );
//
//        dao.save(category);


//        List<Category> catrgorylist = dao.getAll();
//        catrgorylist.forEach(category1 ->
//                        System.out.println(category1.getId() + " " + category1.getTitle() + " " + category1.getDescription())
//                );

//
//        Category res = dao.getByID(1);
//        System.out.println(res.getDescription());

//        dao.delete(1);


    }
}
