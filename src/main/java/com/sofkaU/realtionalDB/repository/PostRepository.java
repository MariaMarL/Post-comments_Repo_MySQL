package com.sofkaU.realtionalDB.repository;

import com.sofkaU.realtionalDB.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
