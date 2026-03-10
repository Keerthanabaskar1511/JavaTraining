package com.wipro.sp_mongo.startup;



import com.wipro.sp_mongo.entity.App;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitializeAppData {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void init() {
        try {

            ObjectMapper mapper = new ObjectMapper();

            List<App> apps = mapper.readValue(
                    new ClassPathResource("data/apps.json").getInputStream(),
                    new TypeReference<List<App>>() {}
            );

            mongoTemplate.insertAll(apps);

            System.out.println("App data loaded successfully");

        } catch (Exception e) {
            System.out.println("Error loading apps: "+e.getMessage());
        }
    }
}
