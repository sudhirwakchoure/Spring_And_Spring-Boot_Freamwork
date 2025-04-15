package com.spring_jdbc_demo_project;

import com.spring_jdbc_demo_project.dao.CategoriesDao;
import com.spring_jdbc_demo_project.entity.Categories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoProjectApplication implements CommandLineRunner {
    
    private CategoriesDao categoriesDao;

    public SpringJdbcDemoProjectApplication(CategoriesDao categoriesDao) {
        this.categoriesDao = categoriesDao;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Categories categories = new Categories();

        //save
//        categories.setId(5);
//        categories.setTitle("AI Robot ");
//        categories.setDescription("This is AI Robot Categories");
//        categoriesDao.save(categories);


//        //getAll
//        List<Categories> res = categoriesDao.getAllCategories();
//        res.forEach(categories1 -> {
//            System.out.println("Title: " + categories1.getTitle());
//            System.out.println("Description: " + categories1.getDescription());
//        });

        //getbytitle

        /*List<Categories> res = categoriesDao.getByTitleOrDescription("Ai", "Categories");
        res.forEach(categories1 -> {
            System.out.println("ID: " + categories1.getId());
            System.out.println("Title: " + categories1.getTitle());
            System.out.println("Description: " + categories1.getDescription());
        });
        System.out.println(res);*/


    }
}
