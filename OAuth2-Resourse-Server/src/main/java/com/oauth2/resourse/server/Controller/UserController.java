package com.oauth2.resourse.server.Controller;


import com.oauth2.resourse.server.DTO.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    @GetMapping()
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
            users.add(new User("sudhir", "wakchaure"));
            users.add(new User("joha", "cena"));
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        return "User created";
    }
}
