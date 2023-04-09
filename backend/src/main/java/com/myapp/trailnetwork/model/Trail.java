package com.myapp.trailnetwork.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trails")
public class Trail {
    @Id
    private String id;

    private String name;
    private String location;
    private Level level;
}