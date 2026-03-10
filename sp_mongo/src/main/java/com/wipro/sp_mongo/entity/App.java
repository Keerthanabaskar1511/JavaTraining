package com.wipro.sp_mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "apps")
public class App {

    @Id
    private String id;
    private String name;
    private String developer;
    private double sizeMB;

    public App() {}

    public App(String name, String developer, double sizeMB) {
        this.name = name;
        this.developer = developer;
        this.sizeMB = sizeMB;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public double getSizeMB() { return sizeMB; }
    public void setSizeMB(double sizeMB) { this.sizeMB = sizeMB; }
}

