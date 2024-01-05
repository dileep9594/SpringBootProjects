package com.mongocurd.mongocrudoperations.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item")
public class Item {
    @Id
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price ;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
}
