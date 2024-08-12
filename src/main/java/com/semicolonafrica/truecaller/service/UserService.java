package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.dto.request.*;

public interface UserService {

    String registerUser(RegisterUserRequest registerUserRequest);
    String loginUser(LoginUserRequest loginUserRequest);
    String logOutUser(LogOutUserRequest logOutUserRequest);
//    String createContact(CreateContactRequest createContactRequest);
//    String updateContact(UpdateContactRequest updateContactRequest);
}