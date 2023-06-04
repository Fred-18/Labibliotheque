package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.models.Comment;
import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import com.labibliotheque.la_bibliotheque.repositories.models.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer>{
    Iterable<Comment> findByBook(BookEntity book);
}
