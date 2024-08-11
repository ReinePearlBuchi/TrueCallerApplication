package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.data.model.Contact;
import com.semicolonafrica.truecaller.data.repository.ContactRepository;
import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.DeleteContactRequest;
import com.semicolonafrica.truecaller.dto.request.UpdateContactRequest;
import com.semicolonafrica.truecaller.dto.request.ViewContactRequest;
import com.semicolonafrica.truecaller.dto.response.CreateContactResponse;
import com.semicolonafrica.truecaller.dto.response.DeleteContactResponse;
import com.semicolonafrica.truecaller.dto.response.UpdateContactResponse;
import com.semicolonafrica.truecaller.dto.response.ViewContactResponse;
import com.semicolonafrica.truecaller.exceptions.ContactNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;

@Service
public class contactServiceImpl implements contactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public CreateContactResponse createContact(CreateContactRequest createContactRequest) {
      Contact contact = new Contact();
      contact.setFirstName(createContactRequest.getFirstName());
      contact.setLastName(createContactRequest.getLastName());
      contact.setPhoneNumber(createContactRequest.getPhoneNumber());
      contact.setEmailAddress(createContactRequest.getEmail());
      contactRepository.save(contact);

      CreateContactResponse createContactResponse = new CreateContactResponse();
      createContactResponse.setMessage("Contact created successfully");
      createContactResponse.setFirstName(contact.getFirstName());
      createContactResponse.setLastName(contact.getLastName());
      createContactResponse.setPhoneNumber(contact.getPhoneNumber());
      createContactResponse.setEmail(contact.getEmailAddress());
      contactRepository.save(contact);

        return createContactResponse;
    }

    @Override
    public DeleteContactResponse deleteContact(DeleteContactRequest deleteContactRequest) {
        Contact contact = contactRepository.findByPhoneNumber(deleteContactRequest.getPhoneNumber());
        if(contact == null) throw new ContactNotFoundException("Contact not found");
        contactRepository.delete(contact);

        DeleteContactResponse deleteContactResponse = new DeleteContactResponse();
        deleteContactResponse.setMessage("Contact deleted successfully");
        deleteContactResponse.setPhoneNumber(contact.getPhoneNumber());
        return deleteContactResponse;
    }

    @Override
    public UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest) {
       Contact contact = contactRepository.findByFirstName(updateContactRequest.getFirstName());
       if(contact == null) throw new ContactNotFoundException(updateContactRequest.getFirstName());
       contact.setLastName(updateContactRequest.getLastName());
       contact.setPhoneNumber(updateContactRequest.getPhoneNumber());
       contactRepository.save(contact);

       UpdateContactResponse updateContactResponse = new UpdateContactResponse();
       updateContactResponse.setMessage("Contact updated successfully");
       updateContactResponse.setFirstName(contact.getFirstName());
       updateContactResponse.setLastName(contact.getLastName());
       updateContactResponse.setPhoneNumber(contact.getPhoneNumber());
       contactRepository.save(contact);
        return updateContactResponse;
    }


    @Override
    public ViewContactResponse viewContact(ViewContactRequest viewContactRequest) {
        return null;
    }
}
