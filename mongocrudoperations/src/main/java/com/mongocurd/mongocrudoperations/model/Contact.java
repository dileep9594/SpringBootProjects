package com.mongocurd.mongocrudoperations.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {
    @Id
    private String id;
    private String name ;
    private String email ;
    @Indexed(unique = true)
    private String primary_number ;
    @Indexed(unique = true)
    private String secondary_number ;

    public Contact(String id ,String name, String email, String primary_number, String secondary_number){
        this.id = id;
        this.name = name;
        this.email = email;
        this.primary_number = primary_number ;
        this.secondary_number = secondary_number ;

    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPrimarNumber(String primary_number){
        this.primary_number = primary_number;
    }
    public String getPrimaryNumber(){
        return this.primary_number;
    }
    public void setSecondaryNumber(String secondary_number){
        this.secondary_number = secondary_number;
    }
    public String getSecondaryNumber(){
        return this.secondary_number;
    }
}
