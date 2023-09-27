package com.labibliotheque.la_bibliotheque.security;

import com.labibliotheque.la_bibliotheque.jwt.Jwt;
import com.labibliotheque.la_bibliotheque.repositories.UserRepository;
import com.labibliotheque.la_bibliotheque.repositories.models.UserEntity;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

@Configuration
public class JwtTokenFilter extends OncePerRequestFilter {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public Jwt jwt;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = request.getHeader("Authorization");
            if (token != null && jwt.validateToken(token)) {
                UserEntity user = userRepository.findByMail(jwt.getUsernameFromToken(token));
                UsernamePasswordAuthenticationToken t = new UsernamePasswordAuthenticationToken(user.getMail(), null, List.of(new SimpleGrantedAuthority(user.getRole().toString())));

                SecurityContextHolder.getContext().setAuthentication(t);
            }
        } catch (
                Exception error
        ) {
            System.out.println(error);
        }

        filterChain.doFilter(request, response);
    }
}
