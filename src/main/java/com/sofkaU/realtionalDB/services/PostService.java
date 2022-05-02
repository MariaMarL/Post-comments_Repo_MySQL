package com.sofkaU.realtionalDB.services;

import com.sofkaU.realtionalDB.entity.Comment;
import com.sofkaU.realtionalDB.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> FindAllPosts();

}
