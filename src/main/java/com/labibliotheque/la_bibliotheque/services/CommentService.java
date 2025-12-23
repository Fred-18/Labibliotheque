package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.CommentMapper;
import com.labibliotheque.la_bibliotheque.dto.Book;
import com.labibliotheque.la_bibliotheque.dto.Comment;
import com.labibliotheque.la_bibliotheque.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;
    
    @Autowired
    private CommentRepository commentRepository;
    
    public Optional<Comment>getComment(int id){
        return commentRepository.findById(id).map(commentMapper::toDto);
    }
    
    public Iterable<Comment> getCommentsFromBooks(Book book){
        return StreamSupport.stream(commentRepository.findAll().spliterator(), false)
                .map(commentMapper::toDto)
                .collect(Collectors.toList());
    }
    
    
    public void addComment(Comment comment){
        commentRepository.save(commentMapper.toEntity(comment));
    }
    public void deleteComment(int id){
        commentRepository.deleteById(id);
    }
}
