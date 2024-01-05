package com.mongocurd.mongocrudoperations.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongocurd.mongocrudoperations.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {
}
