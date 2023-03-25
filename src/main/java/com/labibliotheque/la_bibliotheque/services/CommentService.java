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
    private CommentRepository cor;
    
    public Optional<Comment>getComment(int id){
        return cor.findById(id);
    }
    
    public Iterable<Comment> getCommentsFromBooks(Book book){
        return cor.findByBooks(book);
    }
    
    public void addComment(Comment comment){
        cor.save(comment);
    }
    public void deleteComment(Comment comment){
        cor.delete(comment);
    }
}