package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.data.model.Contact;
import com.semicolonafrica.truecaller.data.model.User;
import com.semicolonafrica.truecaller.data.repository.ContactRepository;
import com.semicolonafrica.truecaller.data.repository.UserRepository;
import com.semicolonafrica.truecaller.dto.request.*;
import com.semicolonafrica.truecaller.dto.response.LogOutUserResponse;
import com.semicolonafrica.truecaller.dto.response.LoginUserResponse;
import com.semicolonafrica.truecaller.exceptions.ContactNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ContactRepository contactRepository;


    @Override
    public String registerUser(RegisterUserRequest registerUserRequest) {
        User newUser = new User();
        newUser.setFirstName(registerUserRequest.getFirstName());
        newUser.setLastName(registerUserRequest.getLastName());
        newUser.setEmail(registerUserRequest.getEmail());
        newUser.setPassword(registerUserRequest.getPassword());
        userRepository.save(newUser);
        return "User registered successfully";
    }

    @Override
    public String loginUser(LoginUserRequest loginUserRequest) {
        User user = userRepository.findByEmail(loginUserRequest.getEmail())
                .orElseThrow(()-> new ContactNotFoundException("Email does not exist"));
        if (!user.getPassword().equals(loginUserRequest.getPassword())) {
           return "invalid login ";
        }
        user.setLoggedIn(true);
        return "login successful";

    }

    @Override
    public String logOutUser(LogOutUserRequest logOutUserRequest) {
        User user = userRepository.findByEmail(logOutUserRequest.getEmail())
                .orElseThrow(()-> new ContactNotFoundException("Email does not exist"));

        if (user != null && user.isLoggedIn()) {
            user.setLoggedIn(false);
        }
        return "logout successful";

    }

//    @Override
//    public String createContact(CreateContactRequest createContactRequest) {
//        Contact newContact = new Contact();
//        newContact.setFirstName(createContactRequest.getFirstName());
//        newContact.setLastName(createContactRequest.getLastName());
//        newContact.setPhoneNumber(createContactRequest.getPhoneNumber());
//        newContact.setEmail(createContactRequest.getEmail());
//        contactRepository.save(newContact);
//
//        return "create contact successful";
//    }
//
//    @Override
//    public String updateContact(UpdateContactRequest updateContactRequest) {
//
//        return "";
//    }

}
