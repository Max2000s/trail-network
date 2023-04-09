package com.myapp.trailnetwork.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.trailnetwork.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

