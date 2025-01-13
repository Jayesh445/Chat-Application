package com.jayesh.chat_application.repository;

import com.jayesh.chat_application.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message,String> {
}
