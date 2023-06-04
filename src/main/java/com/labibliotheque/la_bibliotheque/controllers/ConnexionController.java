package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.jwt.Jwt;
import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;
import java.util.Map;

@RestController
public class ConnexionController {
    @Autowired
    Jwt jwt;
    
    @Autowired
    UserService userService;
    
    @PostMapping(value = "/signin")
    public Map<String,String>signin(@RequestBody User user)throws LoginException{
        String token = jwt.generateToken(userService.loadUserByUsername(user.getMail()));
        return Map.of("token",token);
    }
}
