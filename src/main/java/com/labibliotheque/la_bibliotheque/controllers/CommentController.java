package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.models.Comment;
import com.labibliotheque.la_bibliotheque.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CommentController {
    @Autowired
    private CommentService cos;
    
    @GetMapping("/comment/{id}")
    public Comment getCommentById(@PathVariable int id){
        return cos.getComment(id).orElseThrow();
    }
    @GetMapping("/comment/commentsbybook")
    public Iterable<Comment>getCommentsBybooks(Book book){
        return cos.getCommentsFromBooks(book);
    }
    @PostMapping("/comment/add")
    public void saveComment(@RequestBody Comment comment){
        cos.addComment(comment);
    }
    @PostMapping("/comment/delete/{id}")
    public void deleteComment(@PathVariable("id")int id){
        cos.deleteComment(id);
    }
}   
