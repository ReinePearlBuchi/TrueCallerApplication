package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.DeleteContactRequest;
import com.semicolonafrica.truecaller.dto.request.UpdateContactRequest;
import com.semicolonafrica.truecaller.dto.request.ViewContactRequest;
import com.semicolonafrica.truecaller.dto.response.DeleteContactResponse;
import com.semicolonafrica.truecaller.dto.response.UpdateContactResponse;
import com.semicolonafrica.truecaller.dto.response.ViewContactResponse;

public interface ContactService {
    String createContact(CreateContactRequest createContactRequest);
    String deleteContact(DeleteContactRequest deleteContactRequest);
    String updateContact(String ContactID, UpdateContactRequest updateContactRequest );
    String viewContact(ViewContactRequest viewContactRequest);

}