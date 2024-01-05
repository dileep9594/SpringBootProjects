package com.contactmanagement.contactmanagement.web.dto;

import com.contactmanagement.contactmanagement.model.Contact;
import com.contactmanagement.contactmanagement.model.Gender;
import com.contactmanagement.contactmanagement.model.Salutation;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto {
    String emailId ;
    String firstName ;
    String middleName ;
    String lastName ;
    Gender gender ;
    Salutation salutation ;
    short age ;

    public ContactDto(Contact contact) {
        this.emailId = contact.getEmailId();
        this.firstName = contact.getFirstName();
        this.middleName = contact.getMiddleName();
        this.lastName = contact.getLastName() ;
        this.gender = contact.getGender();
        this.salutation = contact.getSalutation();
        

        

    }

    
}
