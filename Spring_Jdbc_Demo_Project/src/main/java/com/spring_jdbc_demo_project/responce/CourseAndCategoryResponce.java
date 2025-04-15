package com.spring_jdbc_demo_project.responce;

public class CourseAndCategoryResponce {

    private String categories_title;
    private String categories_description ;
    private int course_Id;
    private String course_title;
    private String course_description;
    private int course_price;
    private  int category_Id;

    public CourseAndCategoryResponce() {
    }

    public String getCategories_title() {
        return categories_title;
    }

    public void setCategories_title(String categories_title) {
        this.categories_title = categories_title;
    }

    public String getCategories_description() {
        return categories_description;
    }

    public void setCategories_description(String categories_description) {
        this.categories_description = categories_description;
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public int getCourse_price() {
        return course_price;
    }

    public void setCourse_price(int course_price) {
        this.course_price = course_price;
    }

    public int getCategory_Id() {
        return category_Id;
    }

    public void setCategory_Id(int category_Id) {
        this.category_Id = category_Id;
    }
}
