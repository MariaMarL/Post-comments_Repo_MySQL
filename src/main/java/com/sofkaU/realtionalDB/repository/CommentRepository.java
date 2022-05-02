package com.sofkaU.realtionalDB.repository;

import com.sofkaU.realtionalDB.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
