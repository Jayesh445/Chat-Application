package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    private String name;
    private String phoneNo;
    private String profileImageUrl;
    private String statusMessage;
    private ZonedDateTime createdAt;
    private ZonedDateTime lastSeen;
    @DBRef
    private List<Contact> contacts = new ArrayList<>();

}
