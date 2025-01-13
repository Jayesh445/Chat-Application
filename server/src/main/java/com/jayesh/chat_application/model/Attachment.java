package com.jayesh.chat_application.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Attachment{
    private MessageType mediaType;
    private  String mediaUrl;
    private LocalDateTime uploadedAt;
}
