package com.core.spring.jdbc.spring_jpa_onetomany.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "Jpa_user")  // here @Table is used for set a different name of
                            // the table - instead of the same as entity name
public class User {

    @Id // the @Id this annotation use for the primary key
    @Column(name = "Jpa_user_id")  // @Colum this annotation is used for the give a different name of column
             // instead of the variable name

    private int id;
    @Column(name = "Jpa_user_name", nullable = false)  //@nullable = false it mains is not null
    private String name;
    private String email;
    private boolean isActive;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Laptop> laptopList;



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }
}
