package com.sofkaU.realtionalDB.repository;

import com.sofkaU.realtionalDB.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
