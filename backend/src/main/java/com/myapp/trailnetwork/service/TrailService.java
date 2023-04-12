package com.myapp.trailnetwork.service;

import com.myapp.trailnetwork.model.Trail;
import com.myapp.trailnetwork.model.Level;
import com.myapp.trailnetwork.repository.TrailRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TrailService {
    private final TrailRepository trailRepository;

    public TrailService(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }

    // Add methods for handling CRUD operations and other business logic

    public List<Trail> findAll() {
        return null;
    }

    public Trail createTrail(String name, String location, Level level) {
        Trail newTrail = new Trail();
        newTrail.setName(name);
        newTrail.setLocation(location);
        newTrail.setLevel(level);
        return this.trailRepository.save(newTrail);
    }
}

