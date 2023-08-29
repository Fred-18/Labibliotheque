package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.UserMapper;
import com.labibliotheque.la_bibliotheque.dto.User;
import com.labibliotheque.la_bibliotheque.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) {
        User user = userMapper.toDto(userRepository.findByMail(email)) ;
        if (user == null) throw new UsernameNotFoundException(email);

        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().name()));

        return new org.springframework.security.core.userdetails.User(user.getMail(), user.getPassword(), authorities);
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id).map(userMapper::toDto);
    }

    public Iterable<User> getAllUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    public void addUser(User user) {
        userRepository.save(userMapper.toEntity(user));
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
