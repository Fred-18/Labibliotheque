package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.models.Comment;
import com.labibliotheque.la_bibliotheque.services.CommentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping(value = "comments",produces = "application/json")
    @Tag(name = "comment api")
public class CommentController {
    @Autowired
    private CommentService commentService;
    
    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable int id){
        return commentService.getComment(id).orElseThrow();
    }
    @GetMapping("/comment/commentsbybook")
    public Iterable<Comment>getCommentsBybooks(Book book){
        return commentService.getCommentsFromBooks(book);
    }
    @PostMapping()
    public void saveComment(@RequestBody Comment comment){
        commentService.addComment(comment);
    }
    @PostMapping("/{id}")
    public void deleteComment(@PathVariable("id")int id){
        commentService.deleteComment(id);
    }
}   
