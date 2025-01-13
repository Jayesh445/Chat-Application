package com.jayesh.chat_application.repository;

import com.jayesh.chat_application.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group,String> {
}
