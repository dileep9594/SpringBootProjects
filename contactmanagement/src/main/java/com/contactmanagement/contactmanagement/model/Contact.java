package com.contactmanagement.contactmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection =  "contacts")
@TypeAlias("contact")

public class Contact {
 @Id
 String emailId ;
 @Field("firstName") 
 String firsName ;
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

 public Contact ()









    
}