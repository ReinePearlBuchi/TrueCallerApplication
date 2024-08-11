package com.semicolonafrica.truecaller.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class User {
    @Id
   private String Id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoggedIn;
    private String password;
    @DBRef
    private List<Contact> contactsList;




}
