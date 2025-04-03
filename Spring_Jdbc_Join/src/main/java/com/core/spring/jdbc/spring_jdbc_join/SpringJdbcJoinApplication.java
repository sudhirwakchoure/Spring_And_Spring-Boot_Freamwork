package com.core.spring.jdbc.spring_jdbc_join;

import com.core.spring.jdbc.spring_jdbc_join.dao.CategoriesDao;
import com.core.spring.jdbc.spring_jdbc_join.dao.CourseDao;
import com.core.spring.jdbc.spring_jdbc_join.entity.Categories;
import com.core.spring.jdbc.spring_jdbc_join.entity.Course;
import com.core.spring.jdbc.spring_jdbc_join.responces.CourseCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringJdbcJoinApplication implements CommandLineRunner {


    @Autowired
    private  CategoriesDao categoriesDao;

    @Autowired
    private  CourseDao courseDao;



    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcJoinApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started");

        Categories category= new Categories();

        /* --save--*/
//        category.setId(3);
//        category.setTitle(" Bio It Ai generation");
//        category.setDescription(" Bio It AI Generation of categories");
//        categoriesDao.save(category);

       /*--get by id--*/
//        Categories id = categoriesDao.getByID(1);
//        System.out.println(id.getTitle());

        /*getAll*/
//        List<Categories> categoriesList = categoriesDao.getAll();
//        categoriesList.forEach(c->{
//            System.out.println(c.getId()+" "+c.getTitle()+" "+c.getDescription());
//        });

        /*By like query */
//        List<Categories> categoriesList = categoriesDao.getByTitle("chat");
//        categoriesList.forEach(c->{
//            System.out.println(c.getId()+" "+c.getTitle()+" "+c.getDescription());
//        });


        /*--------------------- courses add ------------------------*/

        //save courses

//        Course course= new Course();
//        course.setCourseId(2);
//        course.setTitle("Spring JPA Join");
//        course.setDescription("Spring JDBC JPA  with ai learning");
//        course.setPrice(6500);
//        course.setCategoriesId(1);
//        courseDao.save(course);


//        List<CourseCategoryResponse> courseCategoryResponse = courseDao.GetCategoryByCourseID(1);
//        courseCategoryResponse.forEach(course -> {
//            System.out.println(course.getCourseId()+ " \t" + course.getCourse_price()
//            + " \t" + course.getCourse_title() + " \t" + course.getCourse_description()
//            + " \t" + course.getCategory_id()+ " \t" + course.getCategory_title()
//            + " \t" + course.getCategory_description());
//        });


        List<CourseCategoryResponse> courseCategoryResponse = categoriesDao.searchCoursesByCategoriesId(1);
        courseCategoryResponse.forEach(category1->{
            System.out.println(category1.getCategory_id()+ " \t" + category1.getCategory_title()
            + " \t" + category1.getCategory_description()+ " \t" +category1.getCourse_price()
                    + " \t" +category1.getCourse_title()+ " \t" +category1.getCourse_description()
                    + " \t" +category1.getCourseId());

        });
    }

}
