package com.jayesh.chat_application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public String messageSender(String message){
        return message;
    }
}
