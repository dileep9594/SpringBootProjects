package com.mongocurd.mongocrudoperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mongocurd.mongocrudoperations.exceptionHandler.DuplicateKeyException;
import com.mongocurd.mongocrudoperations.model.Contact;

import com.mongocurd.mongocrudoperations.repository.ContactRepository;


@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
    public Optional<Contact> getContactById(String id) {
        return contactRepository.findById(id);
    }
    public Contact saveItem(Contact contact) {
        try{ 
            return contactRepository.save(contact);
         } catch (DuplicateKeyException e) {
            throw new DuplicateKeyException("Duplicate key violation: " + e.getMessage());
        }

    }
    public void deleteItem(String id) {
        contactRepository.deleteById(id);
    }

    
}
