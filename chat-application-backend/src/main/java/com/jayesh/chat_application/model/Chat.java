package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Chat {
    private String chatId;
    private ChatType chatType;
    @DBRef
    private List<User> participants = new ArrayList<>();
    @DBRef
    private Group group;
    
}
