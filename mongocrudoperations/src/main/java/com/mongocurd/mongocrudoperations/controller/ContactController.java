package com.mongocurd.mongocrudoperations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongocurd.mongocrudoperations.model.Contact;
import com.mongocurd.mongocrudoperations.service.ContactService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService ;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/allContact")
    public List<Contact> getContacts() {
        return this.contactService.getAllContacts();
    }
    
    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable String id) {
        return contactService.getContactById(id).orElse(null);
    }

    @PostMapping("/save")
    public Contact saveItem(@RequestBody Contact contact) {
        return contactService.saveItem(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable String id) {
        contactService.deleteItem(id);
    }
    
}
