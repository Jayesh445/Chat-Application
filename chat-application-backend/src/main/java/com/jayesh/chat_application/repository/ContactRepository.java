package com.jayesh.chat_application.repository;

import com.jayesh.chat_application.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact,String> {
}
