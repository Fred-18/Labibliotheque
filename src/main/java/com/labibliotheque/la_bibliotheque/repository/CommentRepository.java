package com.labibliotheque.la_bibliotheque.repository;

import com.labibliotheque.la_bibliotheque.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments,Integer>{
}
