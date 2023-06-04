package com.labibliotheque.la_bibliotheque.security;

import com.labibliotheque.la_bibliotheque.mappers.UserMapper;
import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserMapper userMapper;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    public void createNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(userMapper.toEntity(user));
 }
}
