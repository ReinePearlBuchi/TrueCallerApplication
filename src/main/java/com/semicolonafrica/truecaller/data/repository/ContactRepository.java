package com.semicolonafrica.truecaller.data.repository;

import com.semicolonafrica.truecaller.data.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findByFirstName(String firstName);
    Contact findByPhoneNumber(String phoneNumber);


}
