package com.jayesh.chat_application.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MessageRequest {
    private String chatId;
    private User sender;
    private String content;
    private MessageType messageType;
    private List<Attachment> attachments=new ArrayList<>();
}
