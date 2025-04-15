package com.spring_jdbc_demo_project;

import com.spring_jdbc_demo_project.dao.CategoriesDao;
import com.spring_jdbc_demo_project.dao.CourseDao;
import com.spring_jdbc_demo_project.entity.Course;
import com.spring_jdbc_demo_project.responce.CourseAndCategoryResponce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringJdbcDemoProjectApplicationTests {

    @Autowired
   private CourseDao courseDao;

    @Autowired
    private CategoriesDao categoryDao;





    @Test
    void contextLoads() {
    }

    @Test
    public void saveCourse(){
        Course  course = new Course();
        course.setCourseId(2);
        course.setDescription("This is ai course for Deepseek");
        course.setPrice(3000);
        course.setTitle("AI course");
        course.setCategoryId(1);
        courseDao.saveCourse(course);
    }

    @Test
    public void getCoursesByCategoriesId(){
        List<CourseAndCategoryResponce> coursesByCategoriesId = categoryDao.getCoursesByCategoriesId(1);
        coursesByCategoriesId.forEach(courseAndCategoryResponce -> {
            System.out.println(courseAndCategoryResponce.getCategory_Id());
            System.out.println(courseAndCategoryResponce.getCourse_Id());
            System.out.println(courseAndCategoryResponce.getCategories_description());
            System.out.println(courseAndCategoryResponce.getCourse_description());
            System.out.println(courseAndCategoryResponce.getCourse_price());
            System.out.println(courseAndCategoryResponce.getCourse_title());
            System.out.println(courseAndCategoryResponce.getCategories_title());


        });
    }

    @Test
    public void getAllCourses(){
        List<Course> allCourses = courseDao.getAllCourses();
        for (Course course: allCourses) {
            System.out.println(course.getCourseId());

        }

    }


}
