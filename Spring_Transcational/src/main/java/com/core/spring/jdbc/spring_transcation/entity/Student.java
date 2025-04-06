package com.core.spring.jdbc.spring_transcation.entity;

public class Student {

    private int id;
    private String name;
    private int age;
    private boolean isActive;

    public Student() {
    }

    public Student(int id, String name, int age, boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Setter for isActive
    public boolean setIsActive(boolean isActive) {
        this.isActive = isActive;
        return isActive;
    }

    // Getter for isActive
    public boolean isIsActive() {
        return isActive;
    }


}
