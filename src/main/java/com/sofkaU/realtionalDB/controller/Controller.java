package com.sofkaU.realtionalDB.controller;


import com.sofkaU.realtionalDB.entity.Comment;
import com.sofkaU.realtionalDB.entity.Post;
import com.sofkaU.realtionalDB.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(name = "api/")
public class Controller {

    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> getAllPosts(){
        return service.FindAllPosts();
    }

    @PostMapping
    public Post CreatePost(@RequestBody Post post){
        return service.createPost(post);
    }

    @PostMapping
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    }

    @DeleteMapping
    public void deletePost(@RequestBody Post post){
        service.deletePost(post);

    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment){
        service.deleteComment(comment);
    }
}
