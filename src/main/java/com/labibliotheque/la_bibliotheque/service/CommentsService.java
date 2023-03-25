package com.labibliotheque.la_bibliotheque.service;

import com.labibliotheque.la_bibliotheque.model.Books;
import com.labibliotheque.la_bibliotheque.model.Comments;
import com.labibliotheque.la_bibliotheque.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentsService {
    
    @Autowired
    private CommentRepository cor;
    
    public Optional<Comments>getComment(int id){
        return cor.findById(id);
    }
    
    public Iterable<Comments> getCommentsFromBooks(Books books){
        return cor.findByBooks(books);
    }
    
    public void addComment(Comments comments){
        cor.save(comments);
    }
    public void deleteComment(Comments comments){
        cor.delete(comments);
    }
}