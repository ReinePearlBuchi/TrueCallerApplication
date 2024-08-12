package com.semicolonafrica.truecaller.controller;

import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.RegisterUserRequest;
import com.semicolonafrica.truecaller.dto.request.UpdateContactRequest;
import com.semicolonafrica.truecaller.service.ContactService;
import com.semicolonafrica.truecaller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;



    @PostMapping("/create")
    public ResponseEntity<?> createContact(@RequestBody CreateContactRequest createContactRequest) {
        return new ResponseEntity<>(contactService.createContact(createContactRequest), HttpStatus.OK);

    }

    @PostMapping("/update")
    public ResponseEntity<?> updateContact(@PathVariable String contactID, @RequestBody UpdateContactRequest updateContactRequest) {
        return new ResponseEntity<>(contactService.updateContact(contactID,  updateContactRequest), HttpStatus.OK);

    }
}
