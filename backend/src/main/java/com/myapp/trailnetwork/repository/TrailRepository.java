package com.myapp.trailnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.trailnetwork.model.Trail;

@Repository
public interface TrailRepository extends MongoRepository<Trail, String> {
}

