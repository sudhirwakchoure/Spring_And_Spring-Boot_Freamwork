package com.spring_jdbc_demo_project.entity;

public class Course {

    private int courseId;
    private String title;
    private String description;
    private int price;
    private  int category_Id;



    public Course() {
    }

    public Course(int courseId, String title, String description, int price, int categoryId) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category_Id = categoryId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryId() {
        return category_Id;
    }

    public void setCategoryId(int categoryId) {
        this.category_Id = categoryId;
    }
}
