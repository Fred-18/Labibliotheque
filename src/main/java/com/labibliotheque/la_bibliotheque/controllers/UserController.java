package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.dto.User;
import com.labibliotheque.la_bibliotheque.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "users",produces = "application/json")
@Tag(name = "user api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUser(id).orElseThrow();
    }
    @GetMapping()
    public Iterable<User>getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping()
    public void saveUser(@RequestBody User user){
        userService.addUser(user);
    }
    @PostMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
    @PostMapping("{idUser}/booking/{idBook}")
    public  void bookingBook(@PathVariable int idBook , @PathVariable int idUser){
        userService.bookingBook(idBook,idUser);
    }
}

