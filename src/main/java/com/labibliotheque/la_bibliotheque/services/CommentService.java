package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.models.Comment;
import com.labibliotheque.la_bibliotheque.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    public Optional<Comment>getComment(int id){
        return commentRepository.findById(id);
    }
    
    public Iterable<Comment> getCommentsFromBooks(Book book){
        return commentRepository.findByBooks(book);
    }
    
    public void addComment(Comment comment){
        commentRepository.save(comment);
    }
    public void deleteComment(int id){
        commentRepository.deleteById(id);
    }
}