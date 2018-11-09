package com.nilesh.zerodefectdeveloper;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "skill")

public class Skill {

    @Id
    private String id;
    
    @Indexed
    private String name;
    
    public int yearsOfExp;

    public Skill() {}
    
    public String getId() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getYearsOfExp() {
    	return yearsOfExp;
    }

}