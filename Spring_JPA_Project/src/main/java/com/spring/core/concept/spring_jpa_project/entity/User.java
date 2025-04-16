package com.spring.core.concept.spring_jpa_project.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id") // Matches the database column name
        private int userId;       // Follows Java camelCase naming convention

        @Column(name = "user_name", nullable = false) // Matches the database column name
        private String userName;  // Follows Java camelCase naming convention

       @Column(name = "user_email")
        private String userEmail; // CamelCase naming for consistency
        private int age;
        private boolean isActive;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
