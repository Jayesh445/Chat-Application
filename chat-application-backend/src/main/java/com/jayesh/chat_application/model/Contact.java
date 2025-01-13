package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "contacts")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {
    @Id
    private String contactId;
    @DBRef
    private User user;
    @DBRef
    private User contactUser;
    private String nickName;
    private String isBlocked;
    private ZonedDateTime lastInteraction;
}
