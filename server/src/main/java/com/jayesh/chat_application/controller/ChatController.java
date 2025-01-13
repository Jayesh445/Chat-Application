package com.jayesh.chat_application.controller;

import com.jayesh.chat_application.model.Chat;
import com.jayesh.chat_application.model.Message;
import com.jayesh.chat_application.model.MessageRequest;
import com.jayesh.chat_application.model.User;
import com.jayesh.chat_application.repository.ChatRepository;
import com.jayesh.chat_application.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;
    private final ChatRepository chatRepository;
    private final MessageRepository messageRepository;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public String messageSender(String message){
        return message;
    }

    @MessageMapping
    public void privateMessage(MessageRequest messageRequest){
        Chat chat = (Chat) chatRepository.findById(messageRequest.getChatId())
                .orElseThrow(()-> new RuntimeException("Chat Not found"));
        Message message = new Message();
        message.setMessageId(null);
        message.setChat(chat);
        message.setSender(messageRequest.getSender());
        message.setMessageType(messageRequest.getMessageType());
        message.setContent(messageRequest.getContent());
        message.setAttachments(messageRequest.getAttachments());
        message.setReactions(null);
        message.setIsReadBy(null);
        message.setTimeStamp(LocalDateTime.now());
        messageRepository.save(message);
        for(User participants:chat.getParticipants()){
            messagingTemplate.convertAndSendToUser(participants.getUserId(),"/queue/chat/"+chat.getChatId(),message);
        }
    }
}
