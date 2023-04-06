package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUser(id).orElseThrow();
    }
    @GetMapping("/users")
    public Iterable<User>getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/user/add")
    public void saveUser(@RequestBody User user){
        userService.addUser(user);
    }
    @PostMapping("user/delete{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
}
