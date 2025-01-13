package com.jayesh.chat_application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "groups")
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String groupId;
    private String groupName;
    private String groupDescription;
    private ZonedDateTime createdAt;
    private String profileImageUrl;
    private List<User> members = new ArrayList<>();
}
