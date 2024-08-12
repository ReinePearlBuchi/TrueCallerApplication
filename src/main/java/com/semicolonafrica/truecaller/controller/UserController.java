package com.semicolonafrica.truecaller.controller;

import com.semicolonafrica.truecaller.dto.request.CreateContactRequest;
import com.semicolonafrica.truecaller.dto.request.LogOutUserRequest;
import com.semicolonafrica.truecaller.dto.request.LoginUserRequest;
import com.semicolonafrica.truecaller.dto.request.RegisterUserRequest;
import com.semicolonafrica.truecaller.service.UserService;
import com.semicolonafrica.truecaller.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return new ResponseEntity<>(userService.registerUser(registerUserRequest), HttpStatus.OK);

    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginUserRequest loginUserRequest) {
        return new ResponseEntity<>(userService.loginUser(loginUserRequest), HttpStatus.OK);

    }

    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser(@RequestBody LogOutUserRequest logoutUserRequest) {
        return new ResponseEntity<>(userService.logOutUser(logoutUserRequest), HttpStatus.OK);

    }


}
