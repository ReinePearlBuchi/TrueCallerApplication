package com.semicolonafrica.truecaller.service;

import com.semicolonafrica.truecaller.data.model.User;
import com.semicolonafrica.truecaller.data.repository.UserRepository;
import com.semicolonafrica.truecaller.dto.request.LogOutUserRequest;
import com.semicolonafrica.truecaller.dto.request.LoginUserRequest;
import com.semicolonafrica.truecaller.dto.request.RegisterUserRequest;
import com.semicolonafrica.truecaller.dto.response.LogOutUserResponse;
import com.semicolonafrica.truecaller.dto.response.LoginUserResponse;
import com.semicolonafrica.truecaller.dto.response.RegisterUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userServiceImpl implements userService{
    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        return null;
    }

    @Override
    public LoginUserResponse loginUser(LoginUserRequest loginUserRequest) {
        return null;
    }

    @Override
    public LogOutUserResponse logOutUser(LogOutUserRequest logOutUserRequest) {
        return null;
    }
}
