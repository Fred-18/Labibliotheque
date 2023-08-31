package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.dto.LoginForm;
import com.labibliotheque.la_bibliotheque.jwt.Jwt;
import com.labibliotheque.la_bibliotheque.services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "token", produces = "application/json")
@Tag(name = "token api")
public class jwtController {
@Autowired
    public Jwt jwt;
@Autowired
    UserService userService;
@PostMapping()
   public String getToken(@RequestBody LoginForm loginForm){
    System.out.println(loginForm.getEmail());

    return jwt.generateToken(userService.loadUserByUsername(loginForm.getEmail()));
}

}
