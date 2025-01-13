package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    private MessageType messageType;
    private LocalDateTime timeStamp;
    private List<User> isReadBy = new ArrayList<>();
    private Map<User,String> reactions;
    private List<Attachment> attachments= new ArrayList<>();

}
