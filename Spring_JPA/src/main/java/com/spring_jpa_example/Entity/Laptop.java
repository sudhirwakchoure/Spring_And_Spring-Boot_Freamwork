package com.spring_jpa_example.Entity;


import jakarta.persistence.*;

@Entity
@Table(name ="jpa_laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String  model;
    private String  about;



    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private  User  user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
