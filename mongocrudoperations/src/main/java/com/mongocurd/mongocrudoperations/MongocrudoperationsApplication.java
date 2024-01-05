package com.mongocurd.mongocrudoperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongocurd.mongocrudoperations.model.GroceryItem;
import com.mongocurd.mongocrudoperations.repository.ItemRepo;

@SpringBootApplication
@EnableMongoRepositories
public class MongocrudoperationsApplication {
	@Autowired
    private static ItemRepo groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(MongocrudoperationsApplication.class, args);
		createGroceryItems() ;
		
	}
	
	static void createGroceryItems() {
        System.out.println("Data creation started...");
        groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
        groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
        System.out.println("Data creation complete...");
    }

}
