package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.dto.request.LogOutUserRequest;
import com.semicolonafrica.truecaller.dto.request.LoginUserRequest;
import com.semicolonafrica.truecaller.dto.request.RegisterUserRequest;
import com.semicolonafrica.truecaller.dto.response.LogOutUserResponse;
import com.semicolonafrica.truecaller.dto.response.LoginUserResponse;
import com.semicolonafrica.truecaller.dto.response.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface userService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
    LoginUserResponse loginUser(LoginUserRequest loginUserRequest);
    LogOutUserResponse logOutUser(LogOutUserRequest logOutUserRequest);

}