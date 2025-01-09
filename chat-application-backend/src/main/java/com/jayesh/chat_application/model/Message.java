package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "messages")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    @Id
    private String messageId;
    @DBRef
    private Chat chat;
    private User sender;
    private String content;
    

}
