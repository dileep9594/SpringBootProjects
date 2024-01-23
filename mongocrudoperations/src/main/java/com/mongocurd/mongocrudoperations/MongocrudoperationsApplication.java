package com.mongocurd.mongocrudoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongocrudoperationsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MongocrudoperationsApplication.class, args);  
	}
    }

