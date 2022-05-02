package com.sofkaU.realtionalDB.entity;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private Long id;
    private String message;
    private String title;
    private List<Comment> comments = new ArrayList<>();

    public Post addComment(Comment comment) {
        this.comments.add(comment);
        return this;
    }
}
