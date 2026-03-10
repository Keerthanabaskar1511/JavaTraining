package com.wipro.springboot_embeddedmongo.startup;


import com.wipro.springboot_embeddedmongo.entity.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class InitializeData {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void init() throws IOException {
        System.out.println("Initializing data");

        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = objectMapper.readValue(
                new ClassPathResource("data/users.json").getInputStream(),
                new TypeReference<List<User>>() {});

        mongoTemplate.insertAll(users);

        System.out.println("Data initialization completed successfully");
    }
}