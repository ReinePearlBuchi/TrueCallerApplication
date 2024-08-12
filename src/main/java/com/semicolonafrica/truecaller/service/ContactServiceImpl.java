package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.data.model.Contact;
import com.semicolonafrica.truecaller.data.model.User;
import com.semicolonafrica.truecaller.data.repository.ContactRepository;
import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.DeleteContactRequest;
import com.semicolonafrica.truecaller.dto.request.UpdateContactRequest;
import com.semicolonafrica.truecaller.dto.request.ViewContactRequest;
import com.semicolonafrica.truecaller.dto.response.DeleteContactResponse;
import com.semicolonafrica.truecaller.dto.response.UpdateContactResponse;
import com.semicolonafrica.truecaller.exceptions.ContactNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public String createContact(CreateContactRequest createContactRequest) {
      Contact contact = new Contact();
      contact.setFirstName(createContactRequest.getFirstName());
      contact.setLastName(createContactRequest.getLastName());
      contact.setPhoneNumber(createContactRequest.getPhoneNumber());
      contact.setEmail(createContactRequest.getEmail());
      contactRepository.save(contact);
        return "contact created Successful";
    }

    @Override
    public String deleteContact(DeleteContactRequest deleteContactRequest) {
        Contact contact = contactRepository.findByPhoneNumber(deleteContactRequest.getPhoneNumber());
        if(contact == null) throw new ContactNotFoundException("Contact not found");
        contactRepository.delete(contact);

        DeleteContactResponse deleteContactResponse = new DeleteContactResponse();
        deleteContactResponse.setMessage("Contact deleted successfully");
        deleteContactResponse.setPhoneNumber(contact.getPhoneNumber());
        return "";
    }

    @Override
    public String updateContact(String contactID, UpdateContactRequest updateContactRequest) {

       Contact foundContact = contactRepository.findById(contactID)
               .orElseThrow(() -> new ContactNotFoundException("Contact not found"));
       foundContact.setFirstName(updateContactRequest.getFirstName());
       foundContact.setLastName(updateContactRequest.getLastName());
       foundContact.setPhoneNumber(updateContactRequest.getPhoneNumber());
       foundContact.setEmail(updateContactRequest.getEmail());
       contactRepository.save(foundContact);
        return "updated contact successfully";
    }


    @Override
    public String viewContact(ViewContactRequest viewContactRequest) {

        return "";
    }
}
