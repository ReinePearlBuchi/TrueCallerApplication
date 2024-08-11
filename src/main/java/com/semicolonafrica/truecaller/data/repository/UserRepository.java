package com.semicolonafrica.truecaller.data.repository;

import com.semicolonafrica.truecaller.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
