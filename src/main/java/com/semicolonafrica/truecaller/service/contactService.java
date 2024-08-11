package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.DeleteContactRequest;
import com.semicolonafrica.truecaller.dto.request.UpdateContactRequest;
import com.semicolonafrica.truecaller.dto.request.ViewContactRequest;
import com.semicolonafrica.truecaller.dto.response.CreateContactResponse;
import com.semicolonafrica.truecaller.dto.response.DeleteContactResponse;
import com.semicolonafrica.truecaller.dto.response.UpdateContactResponse;
import com.semicolonafrica.truecaller.dto.response.ViewContactResponse;

public interface contactService {
    CreateContactResponse createContact(CreateContactRequest createContactRequest);
    DeleteContactResponse deleteContact(DeleteContactRequest deleteContactRequest);
    UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest);
    ViewContactResponse viewContact(ViewContactRequest viewContactRequest);

}