package com.jayesh.chat_application.repository;

import com.jayesh.chat_application.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
