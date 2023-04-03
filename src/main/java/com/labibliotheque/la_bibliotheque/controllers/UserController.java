package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService us;
    @GetMapping("/user/{id}")
    public User getUserById(int id){
        return us.getUser(id).orElseThrow();
    }
    @GetMapping("/users")
    public Iterable<User>getAllUsers(){
        return us.getAllUsers();
    }
    @PostMapping("/user/add")
    public void saveUser(@RequestBody User user){
        us.addUser(user);
    }
    @PostMapping("user/delete")
    public void deleteUser(@PathVariable("id") User user){
        us.deleteUser(user);
    }
}
