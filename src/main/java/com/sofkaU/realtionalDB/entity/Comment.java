package com.sofkaU.realtionalDB.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Commet")
@Table(name = "comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String message;
    private Long FK_post_id;

}
