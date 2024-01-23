package com.mongocurd.mongocrudoperations.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongocurd.mongocrudoperations.model.Contact;


public interface ContactRepository extends MongoRepository<Contact, String> {
}
