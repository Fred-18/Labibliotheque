package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository us;

    public Optional<User> getUser(int id) {
        return us.findById(id);
    }

    public Iterable<User> getAllUsers() {
        return us.findAll();
    }

    public void addUser(User user) {
        us.save(user);
    }

    public void deleteUser(int id) {
        us.deleteById(id);
    }
}