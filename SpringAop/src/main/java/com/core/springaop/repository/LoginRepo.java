package com.core.springaop.repository;


import org.springframework.stereotype.Repository;

@Repository
public class LoginRepo {

    public void getUser() {
        System.out.println("getUser");

    }
}
