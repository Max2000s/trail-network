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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Level getlevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}