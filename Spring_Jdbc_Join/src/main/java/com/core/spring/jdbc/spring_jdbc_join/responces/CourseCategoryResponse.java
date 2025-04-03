package com.core.spring.jdbc.spring_jdbc_join.responces;

public class CourseCategoryResponse {

    private int courseId;
    private String course_title;
    private String course_description;
    private int course_price;
    private int category_id;
    private String category_title;
    private String category_description;


    public CourseCategoryResponse() {

    }

    public CourseCategoryResponse(int courseId, String course_title, String course_description,
       int course_price, int category_id, String category_title, String category_description) {
        this.courseId = courseId;
        this.course_title = course_title;
        this.course_description = course_description;
        this.course_price = course_price;
        this.category_id = category_id;
        this.category_title = category_title;
        this.category_description = category_description;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_title() {
        return category_title;
    }

    public void setCategory_title(String category_title) {
        this.category_title = category_title;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }
}
