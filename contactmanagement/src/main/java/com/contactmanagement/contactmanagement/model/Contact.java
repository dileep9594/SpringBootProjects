package com.contactmanagement.contactmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.contactmanagement.contactmanagement.web.dto.ContactDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection =  "contacts")
@TypeAlias("contact")
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
 @Id
 String emailId ;
 @Field("firstName") 
 String firstName ;
 @Field("middleName") 
 String middleName ;
 @Field("lastName") 
 String lastName ;
 @Field("fullName") 
 String fullName ;
 @Field("gender")
 Gender gender ;
 @Field("salutation")
 Salutation salutation ;
 @Field("age")
 short age ;

 public Contact (ContactDto contactdao){

 } 









    
}